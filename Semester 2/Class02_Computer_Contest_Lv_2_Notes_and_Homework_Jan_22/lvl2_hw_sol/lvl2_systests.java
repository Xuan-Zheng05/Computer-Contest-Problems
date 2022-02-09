import java.util.*;
import java.io.*;

public class lvl2_systests {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int batch = readInt(), s[] = new int[batch], e[] = new int[batch], val[] = new int[batch];
		for (int i = 0; i < batch; i++) {
			s[i] = readInt();
			e[i] = readInt();
			val[i] = readInt();
		}
		int fail = readInt(), c[] = new int[fail];
		for (int i = 0; i < fail; i++) {
			c[i] = readInt();
		}
		Arrays.sort(c);
		int ans = 0;
		for (int i = 0; i < batch; i++) {
			int p = Arrays.binarySearch(c, s[i]); // if there is no such case, return - insertion_point - 1
			if (p < 0)
				p = -p - 1;
			if (p == c.length || c[p] > e[i])
				ans += val[i];
		}
		System.out.println(ans);
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