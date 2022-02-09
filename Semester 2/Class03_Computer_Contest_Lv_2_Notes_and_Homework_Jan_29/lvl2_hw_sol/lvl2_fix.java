import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt();
		for(int t=1; t<=n; t++) {
			String s[] = new String[3];
			for(int i=0; i<3; i++) s[i] = readLine();
			boolean fix = false;
			for(int i=0; i<3; i++) {
				for(int j=0; j<3; j++) {
					if(i == j || s[i].length() < s[j].length()) continue;
					if(s[i].substring(0, s[j].length()).equals(s[j]) || s[i].substring(s[i].length()-s[j].length()).equals(s[j])) {
						fix = true;
					}
				}
			}
			if(fix) System.out.println("No");
			else System.out.println("Yes");
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