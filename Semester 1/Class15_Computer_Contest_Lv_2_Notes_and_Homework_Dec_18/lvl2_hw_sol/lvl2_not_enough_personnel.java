import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(); String name [] = new String[n]; int s[] = new int[n];
		for(int i=0; i<n; i++) {
			name[i] = next(); s[i] = readInt();
		}
		int q = readInt();
		for(int i=1; i<=q; i++) {
			int x = readInt(), d = readInt(), mi = Integer.MAX_VALUE; String ans = "";
			for(int j=0; j<n; j++) {
				if(s[j] >= x && s[j] <= x + d) {
					if(s[j] - x < mi) {
						mi = s[j] - x; ans = name[j];
					}
				}
			}
			if(mi == Integer.MAX_VALUE) System.out.println("No suitable teacher!");
			else System.out.println(ans);
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