import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = readLine(); int psa[][] = new int[26][s.length() + 1];
		for(int i=1; i<=s.length(); i++) {
			for(int j=0; j<26; j++)
				psa[j][i] = psa[j][i-1];
			char c = s.charAt(i-1);
			if(c != ' ') psa[c - 'a'][i]++;
		}
		int q = readInt();
		for(int i=1; i<=q; i++) {
			int L = readInt(), R = readInt(); char c = readCharacter();
			System.out.println(psa[c-'a'][R] - psa[c-'a'][L-1]);
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