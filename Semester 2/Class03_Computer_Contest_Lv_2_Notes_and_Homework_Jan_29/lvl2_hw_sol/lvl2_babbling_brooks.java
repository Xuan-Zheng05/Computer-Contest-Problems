import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(); List<Double> s = new ArrayList();
		for(int i=0; i<n; i++) s.add(readDouble());
		while(true) {
			int op = readInt();
			if(op == 77) break;
			if(op == 99) { //split
				int idx = readInt() - 1; double pct = readDouble();
				double lft = s.get(idx)*pct/100.0, rit = s.get(idx) - lft;
				s.set(idx, lft); s.add(idx+1, rit);
			}
			if(op == 88) { //join
				int idx = readInt() - 1; 
				s.set(idx, s.get(idx) + s.get(idx+1)); s.remove(idx+1);
			}
		}
		for(double x : s) System.out.print(Math.round(x) + " ");
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