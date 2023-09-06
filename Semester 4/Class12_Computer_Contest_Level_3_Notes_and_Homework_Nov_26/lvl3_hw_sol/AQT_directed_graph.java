import java.io.*;
import java.time.Period;
import java.util.*;

public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, vis[]; static List<Integer> adj[];
    public static void main(String[] args) throws IOException {
    	n = readInt(); m = readInt(); vis = new int[n+1];
    	adj = new ArrayList[n+1];
    	for(int i=1; i<=n; i++) adj[i] = new ArrayList<>();
    	for(int i=1; i<=m; i++) {
    		int u = readInt(), v = readInt(); adj[v].add(u);
    	}
    	for(int i=n; i>=1; i--) {
    		if(vis[i] == 0) dfs(i, i);
    	}
    	for(int i=n; i>=1; i--) {
    		if(vis[i] > i) { 
    			System.out.println(i + " " + vis[i]); return;
    		}
    	}
    	System.out.println(-1);
    }
    static void dfs(int u, int mx) {
    	vis[u] = mx;
    	for(int v : adj[u]){
    		if(vis[v] == 0) dfs(v, mx);
    	}
    }
    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine().trim());
        return st.nextToken();
    }

    static long readLong() throws IOException {
        return Long.parseLong(next());
    }

    static int readInt() throws IOException {
        return Integer.parseInt(next());
    }

    static double readDouble() throws IOException {
        return Double.parseDouble(next());
    }

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}