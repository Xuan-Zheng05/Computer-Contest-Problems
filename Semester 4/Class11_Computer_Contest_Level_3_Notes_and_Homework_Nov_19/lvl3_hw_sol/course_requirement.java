import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), in[] = new int[n+1];
    	List<Integer> adj[] = new ArrayList[n+1];
    	for(int i=1; i<=n; i++) adj[i] = new ArrayList<>();
    	for(int i=1; i<=n; i++) {
    		in[i] = readInt();
    		for(int j=0; j<in[i]; j++) {
    			int k = readInt(); adj[k].add(i);
    		}
    	}
    	Queue<Integer> q = new LinkedList<>();
    	for(int i=1; i<=n; i++)
    		if(in[i] == 0) q.add(i);
    	List<Integer> order = new ArrayList<>();
    	while(!q.isEmpty()) {
    		int u = q.poll(); order.add(u);
    		for(int v : adj[u]) {
    			in[v] --; 
    			if(in[v] == 0) q.add(v);
    		}
    	}
    	for(int i=0; i<n; i++)
    		System.out.print(order.get(i) + (i==n-1? "\n": " "));
    	
    }
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
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