import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int [] x = {1, 1, 2, 3, 3}, y = {7, 4, 1, 4, 5};
    	int n = 7, in[] = new int[n+1];
    	List<Integer> adj[] = new ArrayList[n+1];
    	for(int i=1; i<=n; i++) adj[i] = new ArrayList<>();
    	for(int i=0; i<x.length; i++) {
    		adj[x[i]].add(y[i]);  in[y[i]]++;
    	}
    	while(true) {
    		int u = readInt(), v = readInt();
    		if(u == 0) break;
    		adj[u].add(v); in[v]++;
    	}
    	PriorityQueue<Integer> q = new PriorityQueue<>();
    	List<Integer> order = new ArrayList<>();
    	for(int i=1; i<=n; i++){
    		if(in[i] == 0) q.add(i);
    	}
    	while(!q.isEmpty()) {
    		int u = q.poll(); order.add(u);
    		for(int v : adj[u]) {
    			if(--in[v] == 0) q.add(v);
    		}
    	}
    	if(order.size() != n) 
    		System.out.println("Cannot complete these tasks. Going to bed.");
    	else {
    		for(int k : order) System.out.print(k + " ");
    	}
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