//^-^

import java.util.*;
import java.io.*;

public class homework {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
    	int n = readInt(), m = readInt(), p[] = new int[n+1];
    	for(int i=1; i<=n; i++) {
    		p[i] = i;
    	}
    	int cycle_edge = 0;
    	for(int i=1; i<=m; i++) {
    		int u = readInt(), v = readInt();
    		int fu = find_set(u, p), fv = find_set(v, p);
    		if(fu != fv) {
    			p[fu] = fv;
    		}else {
    			cycle_edge++;
    		}
    	}
    	System.out.println(cycle_edge <= 1? "YES" : "NO");
    }
    static int find_set(int d, int p[]) {
    	if(d != p[d]) p[d] = find_set(p[d], p);
    	return p[d];
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