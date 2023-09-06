import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt(), m = readInt(), in[] = new int[n+1];
    	List<Integer> adj[] = new ArrayList[n+1];
    	for(int i=1; i<=n; i++) adj[i] = new ArrayList<>();
    	for(int i=1; i<=m; i++) {
    		int u = readInt(), v = readInt();
    		adj[v].add(u);  in[u]++;
    	}
    	Queue<Integer> q = new LinkedList<>();
    	List<Integer> order = new ArrayList<>();
    	for(int i=1; i<=n; i++)
    		if(in[i] == 0) q.add(i);
    	while(!q.isEmpty()) {
    		int u = q.poll(); order.add(u);
    		for(int v : adj[u])
    			if(--in[v] == 0) q.add(v);
    	}
    	if(order.size() != n) System.out.println(-1);
    	else {
    		System.out.println(n);
    		for(int x : order) System.out.println(x + " 1");
    	}
    }
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}