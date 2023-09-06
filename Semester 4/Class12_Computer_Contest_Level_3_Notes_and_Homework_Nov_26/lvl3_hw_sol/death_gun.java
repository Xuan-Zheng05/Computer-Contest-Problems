import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
    	int n = readInt(), idx = 0;
    	List<Integer> adj[] = new ArrayList[2*n];
    	for(int i=0; i<adj.length; i++)
    		adj[i] = new ArrayList();
    	int [] indeg = new int[2*n];
    	Map<String, Integer> map = new HashMap();
    	List<String> name = new ArrayList();
    	for(int i=1; i<=n; i++) {
    		String a = next(), b = next();
    		if(!map.containsKey(a)) {
    			map.put(a, idx); name.add(a); idx++;
    		}
    		if(!map.containsKey(b)) {
    			map.put(b, idx); name.add(b); idx++;
    		}
    		adj[map.get(b)].add(map.get(a)); 
    		indeg[map.get(a)]++;
    	}
    	PriorityQueue<Integer> q = new PriorityQueue<>();
    	List<Integer> order = new ArrayList();
    	for(int i=0; i<idx; i++) {
    		if(indeg[i] == 0) q.add(i);
     	}
    	while(!q.isEmpty()) {
    		int cur = q.poll();  order.add(cur);
    		for(int nxt: adj[cur]) {
    			indeg[nxt]--;
    			if(indeg[nxt] == 0) q.add(nxt);
    		}
    	}
    	for(int x : order) System.out.println(name.get(x));
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