import java.util.*;
import java.math.*;
import java.io.*;
public class Main {
	final private static int BUFFER_SIZE = 1 << 16;
    private static DataInputStream din = new DataInputStream(System.in);
    private static byte[] buffer = new byte[BUFFER_SIZE];
    private static int bufferPointer = 0, bytesRead = 0;
    public static List<Pair>[] list;
    public static boolean[] vis, revis, vertexVis;
    public static long[] dis, fromRoot, fromVertex;
    public static Queue<Integer> q = new LinkedList<>();
    public static void main(String[] args) throws IOException {
    	//Test for 4th Subtask
		int N = readInt(), M = readInt(), Q = readInt();
		list = new ArrayList[N+1];
		for(int i = 1; i <= N; i++) list[i] = new ArrayList<>();
		for(int i = 1; i <= M; i++) {
			int a = readInt(), b = readInt(), w = readInt();
			list[a].add(new Pair(b, w));
			list[b].add(new Pair(a, w));
		}
		if(Q == 1) {
			//Trivial case, diam of every tree
			vis = new boolean[N+1];
			revis = new boolean[N+1];
			dis = new long[N+1];
			long ans = 0;
			for(int i = 1; i <= N; i++) {
				if(vis[i]) continue;
				ans += BFS(i)+1;
			}
			System.out.println(ans-1);
		} else {
			//Non-Trivial case, minimum height. Use the strategy from Saving Nagato (DMOPC14C4P6)
			vis = new boolean[N+1];
			revis = new boolean[N+1];
			vertexVis = new boolean[N+1];
			dis = new long[N+1];
			fromRoot = new long[N+1];
			fromVertex = new long[N+1];
			long ans = 0, inc = 0;
			for(int i = 1; i <= N; i++) {
				if(vis[i]) continue;
				long S = RBFS(i);
				if(S == ans) inc = 1;
				else if(S > ans) {
					ans = S;
					inc = 0;
				}
			}
			System.out.println(ans+inc);
		}	
	}
    public static long BFS(int n) {
    	q.add(n);
    	vis[n] = true;
    	long maxE = 0;
    	int endpoint = n;
    	while(! q.isEmpty()) {
    		int K = q.poll();
    		if(maxE < dis[K]) {
    			maxE = dis[K];
    			endpoint = K;
    		}
    		for(int i = 1; i <= list[K].size(); i++) {
    			if(! vis[list[K].get(i-1).d]) {
    				vis[list[K].get(i-1).d] = true;
    				dis[list[K].get(i-1).d] = dis[K]+((long) list[K].get(i-1).w);
    				q.add(list[K].get(i-1).d);
    			} 
    		}
    	}
    	q.add(endpoint);
    	revis[endpoint] = true;
    	long maxDist = 0;
    	dis[endpoint] = 0;
    	while(! q.isEmpty()) {
    		int K = q.poll();
    		maxDist = Math.max(maxDist, dis[K]);
    		for(int i = 1; i <= list[K].size(); i++) {
    			if(! revis[list[K].get(i-1).d]) {
    				revis[list[K].get(i-1).d] = true;
    				dis[list[K].get(i-1).d] = dis[K]+((long) list[K].get(i-1).w);
    				q.add(list[K].get(i-1).d);
    			}
    		}
    	}
    	return maxDist;
    }
    public static long RBFS(int n) {
    	q.add(n);
    	vis[n] = true;
    	long maxE = 0;
    	int root = n;
    	int connectedPoints = 0;
    	while(! q.isEmpty()) {
    		int K = q.poll();
    		connectedPoints++;
    		if(maxE < dis[K]) {
    			maxE = dis[K];
    			root = K;
    		}
    		for(Pair L : list[K]) {
    			if(vis[L.d]) continue;
    			vis[L.d] = true;
    			dis[L.d] = dis[K]+((long) L.w);
    			q.add(L.d);
    		}
    	}
    	int[] edges = new int[connectedPoints+1];
    	int pin = 1;
    	q.add(root);
    	revis[root] = true;
    	maxE = 0;
    	int vertex = root;
    	while(! q.isEmpty()) {
    		int K = q.poll();
    		edges[pin++] = K;
    		if(fromRoot[K] > maxE) {
    			maxE = fromRoot[K];
    			vertex = K;
    		}
    		for(Pair L: list[K]) {
    			if(revis[L.d]) continue;
    			revis[L.d] = true;
    			fromRoot[L.d] = fromRoot[K]+((long) L.w);
    			q.add(L.d);
    		}
    	}
    	q.add(vertex);
    	vertexVis[vertex] = true;
    	while(! q.isEmpty()) {
    		int K = q.poll();
    		for(Pair L: list[K]) {
    			if(vertexVis[L.d]) continue;
    			vertexVis[L.d] = true;
    			fromVertex[L.d] = fromVertex[K]+((long) L.w);
    			q.add(L.d);
    		}
    	}
    	//for(int i = 1; i <= connectedPoints; i++) System.out.println(edges[i]);
    	//System.out.println();
    	long ans = Math.max(fromRoot[edges[1]], fromVertex[edges[1]]);
    	for(int i = 1; i <= connectedPoints; i++) ans = Math.min(ans, Math.max(fromRoot[edges[i]], fromVertex[edges[i]]));
    	return ans;
    }
    public static class Pair {
    	int d, w;
    	public Pair(int d, int w) {
    		this.d = d;
    		this.w = w;
    	}
    }
	public static String next() throws IOException{
		byte[] ret = new byte[10001];
        int idx = 0;
        byte c = Read();
        while (c <= ' ') c = Read();
        do {
            ret[idx++] = c;
            c = Read();
        } while (c != -1 && c != ' ' && c != '\n' && c != '\r');
        return new String(ret, 0, idx);
	}
	public static long readLong() throws IOException {
		long ret = 0;
		byte c = Read();
		while(c <= ' ') c = Read();
		boolean neg = (c == '-');
		if(neg) c = Read();
		do ret = ret*10+c-'0';
		while((c = Read()) >= '0' && c <= '9');
		if(neg) return -ret;
		return ret;
	}
	public static int readInt() throws IOException {
        int ret = 0;
        byte c = Read();
        while (c <= ' ') c = Read();
        boolean neg = (c == '-');
        if (neg) c = Read();
        do ret = ret * 10 + c - '0';
        while ((c = Read()) >= '0' && c <= '9');
        if(neg) return -ret;
        return ret;
    }
    private static void fillBuffer() throws IOException {
        bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
        if (bytesRead == -1) buffer[0] = -1;
    }
    private static byte Read() throws IOException {
        if (bufferPointer == bytesRead) fillBuffer();
        return buffer[bufferPointer++];
    }
}