//^-^

import java.util.*;
import java.io.*;

public class homework {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt(), m = readInt(), d = readInt();
    	int p[] = new int[n+1], dest[] = new int[d];
    	for(int i=1; i<=n; i++) p[i] = i;
    	PriorityQueue<edge> lst = new PriorityQueue<>();
    	for(int i=1; i<=m; i++) {
    		int u = readInt(), v = readInt(), w = readInt();
    		lst.add(new edge(u, v, w));
    	}
    	for(int i=0; i<d; i++) dest[i] = readInt();
    	int ans = 0;
    	for(int i=0; i<dest.length; i++) {
    		while(find_set(1, p) != find_set(dest[i], p)) {
    			edge e = lst.poll();
    			int fu = find_set(e.u, p), fv = find_set(e.v, p);
    			if(fu != fv) {
    				p[fu] = fv; ans = e.w;
    			}
    		}
    	}
    	System.out.println(ans);
    }
    static int find_set(int d, int p[]) {
    	if(d != p[d]) p[d] = find_set(p[d], p);
    	return p[d];
    }
    static class edge implements Comparable<edge>{
    	int u, v, w;
    	edge(int u0, int v0, int w0){ u = u0; v = v0; w=w0; }
    	public int compareTo(edge x) {
    		return -Integer.compare(w, x.w);
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