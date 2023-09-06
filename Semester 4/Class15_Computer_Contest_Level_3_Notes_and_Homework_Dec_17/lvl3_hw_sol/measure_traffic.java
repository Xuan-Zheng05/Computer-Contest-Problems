import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int n, lo[], hi[]; static String event[];
	public static void main(String[] args) throws IOException{	
		n = readInt(); event = new String[n]; lo = new int[n]; hi = new int[n];
		for(int i=0; i<n; i++) {
			event[i] = next(); lo[i] = readInt(); hi[i] = readInt();
		}
		fun("on"); fun("off");
	}
	static void reverse() {
		for(int l=0, r=n-1; l<r; l++, r--) {
			int tmp = lo[l];  lo[l] = lo[r]; lo[r] = tmp;
			tmp = hi[l]; hi[l] = hi[r]; hi[r] = tmp;
			String t = event[l]; event[l] = event[r]; event[r] = t;
		}
	}
	static void fun(String s) {
		reverse();   int min = Integer.MIN_VALUE/2, max = Integer.MAX_VALUE/2;
		for(int i=0; i<event.length; i++) {
			if(event[i].equals("none")) {
				min = Math.max(min, lo[i]); max = Math.min(max, hi[i]);
			}else if(event[i].equals(s)) {
				min = Math.max(0, min-hi[i]); max = Math.max(0, max - lo[i]);
			}else {
				min += lo[i];  max += hi[i];
			}
		}
		System.out.println(min + " " + max);
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}	
}