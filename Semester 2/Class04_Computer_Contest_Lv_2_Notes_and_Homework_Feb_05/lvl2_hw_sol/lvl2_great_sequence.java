import java.util.*;
import java.io.*;

public class lvl2_great_sequence {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// static PrintWriter pr = new PrintWriter(new BufferedWriter(new
	// OutputStreamWriter(System.out)));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int N = readInt(), K = readInt(), Q = readInt();
		int psa[] = new int[N + 1];
		ArrayList<Integer> lst[] = new ArrayList[2001];
		for (int i = 0; i < lst.length; i++)
			lst[i] = new ArrayList<Integer>();
		for (int i = 1; i <= N; i++) {
			psa[i] = readInt();
			lst[psa[i] + 1000].add(i);
			psa[i] += psa[i - 1];
		}
		for (int i = 1; i <= Q; i++) {
			int a = readInt(), b = readInt(), x = readInt(), y = readInt();
			if (psa[y] - psa[x - 1] > K) {
				a += 1000;
				b += 1000;
				int pa = Collections.binarySearch(lst[a], x);
				int pb = Collections.binarySearch(lst[b], x);
				if (pa < 0)
					pa = -(pa + 1);
				if (pb < 0)
					pb = -(pb + 1);
				if (pa < lst[a].size() && lst[a].get(pa) <= y &&
						pb < lst[b].size() && lst[b].get(pb) <= y)
					System.out.println("Yes");
				else
					System.out.println("No");
			} else
				System.out.println("No");
		}
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