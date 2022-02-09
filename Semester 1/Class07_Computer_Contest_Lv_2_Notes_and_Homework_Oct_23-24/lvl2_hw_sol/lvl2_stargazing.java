import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), x[] = new int[n], y[] = new int[n];
		Set<String> set = new HashSet<>();
		set.add(0 + " " + 0);
		for(int i=1; i<n; i++) {
			int p = readInt() - 1, dx = readInt(), dy = readInt();
			x[i] = x[p] + dx;  y[i] = y[p] + dy;
			set.add(x[i] + " " + y[i]);
		}
		System.out.println(set.size());
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