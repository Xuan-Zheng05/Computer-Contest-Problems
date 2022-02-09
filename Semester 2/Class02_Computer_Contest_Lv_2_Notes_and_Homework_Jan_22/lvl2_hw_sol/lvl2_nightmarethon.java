import java.util.*;
import java.io.*;

public class lvl2_nightmarethon {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		int n = readInt(), q = readInt();
		int[] a = new int[n + 2], pmax = new int[n + 2], pcnt = new int[n + 2], smax = new int[n + 2],
				scnt = new int[n + 2];
		for (int i = 1; i <= n; i++) {
			a[i] = readInt();
			if (pmax[i - 1] > a[i]) {
				pmax[i] = pmax[i - 1];
				pcnt[i] = pcnt[i - 1];
			} else if (pmax[i - 1] < a[i]) {
				pmax[i] = a[i];
				pcnt[i] = 1;
			} else {
				pmax[i] = pmax[i - 1];
				pcnt[i] = pcnt[i - 1] + 1;
			}
		}
		for (int i = n; i >= 1; i--) {
			if (smax[i + 1] > a[i]) {
				smax[i] = smax[i + 1];
				scnt[i] = scnt[i + 1];
			} else if (smax[i + 1] < a[i]) {
				smax[i] = a[i];
				scnt[i] = 1;
			} else {
				smax[i] = smax[i + 1];
				scnt[i] = scnt[i + 1] + 1;
			}
		}
		for (int i = 1; i <= q; i++) {
			int x = readInt(), y = readInt();
			int lmax = pmax[x - 1], lcnt = pcnt[x - 1], rmax = smax[y + 1], rcnt = scnt[y + 1];
			if (lmax > rmax)
				System.out.println(lmax + " " + lcnt);
			else if (lmax < rmax)
				System.out.println(rmax + " " + rcnt);
			else
				System.out.println(lmax + " " + (lcnt + rcnt));
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