import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
	    int n = readInt(), mx1 = 0, mx2 = 0;
	    Map<Integer, Integer> map = new HashMap<>();
	    for(int i=0; i<n; i++) {
	    	int x = readInt();
	    	map.put(x, map.getOrDefault(x, 0)+1);
	    }
	    for(Map.Entry<Integer, Integer> e : map.entrySet()) {
	    	int v = e.getValue();
	    	if(v > mx1) { mx2 = mx1; mx1 = v;}
	    	else if(v > mx2) mx2 = v;
	    }
	    System.out.println(mx1 + mx2);
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