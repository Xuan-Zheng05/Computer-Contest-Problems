import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int R = readInt(), C = readInt(); 
		boolean [] row = new boolean[R], col = new boolean[C];
		for(int i=0; i<R; i++) {
			String s = readLine();
			for(int j=0; j<C; j++) {
				if(s.charAt(j) == 'X') { 
					row[i]=true; col[j] = true; 
				}
			}
		}
		for(int q = readInt(); q > 0 ; q--) {
			int c = readInt() - 1, r = readInt() - 1;
			if(row[r] || col[c]) System.out.println("Y");
			else System.out.println("N");
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