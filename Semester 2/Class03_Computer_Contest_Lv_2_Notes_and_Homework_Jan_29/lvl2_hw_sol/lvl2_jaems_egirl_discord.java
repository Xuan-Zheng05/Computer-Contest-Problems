import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n =readInt(), k = readInt();
		long psa[] = new long[n+1], min[] = new long[n+1], ans = 0;
		for(int i=1; i<=n; i++) psa[i] = psa[i-1] + readLong();
		for(int i=0; i<=k-1; i++) min[i] = psa[i];
		for(int i=k; i<=n; i++) {
			int rem = i % k;
			ans = Math.max(ans, psa[i] - min[rem]);
			min[rem] = Math.min(psa[i], min[rem]);
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
