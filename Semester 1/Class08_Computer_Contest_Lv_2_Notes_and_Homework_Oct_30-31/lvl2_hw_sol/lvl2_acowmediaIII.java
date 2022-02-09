import java.io.*;
import java.util.*;

public class AcowdemiaIII {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static PrintWriter pr = new PrintWriter(new OutputStreamWriter(System.out));
	static String readLine() throws IOException {
		return br.readLine();
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(readLine());
		return st.nextToken();
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}
	static char readChar() throws IOException {
		return next().charAt(0);
	}
	static class Pair implements Comparable<Pair> {
		int f, s;
		Pair(int f, int s) {
			this.f = f; this.s = s;
		}
		public int compareTo(Pair other) {
			if (this.f != other.f) return this.f - other.f;
			return this.s - other.s;
		}
	}
	final static int dr[] = {1, 0, -1, 0}, dc[] = {0, 1, 0, -1};
	public static void main(String[] args) throws IOException {
		int R = readInt(), C = readInt();
		char g[][] = new char[R + 1][C + 1];
		for (int i = 1; i <= R; ++i)
			g[i] = (" " + readLine()).toCharArray();
		int ans = 0;
		for (int i = 1; i <= R; ++i) {
			for (int j = 1; j <= C - 2; ++j) {
				if (g[i][j] == 'C' && g[i][j + 1] == 'G' && g[i][j + 2] == 'C') {
					++ans;
					g[i][j + 1] = '.';
				}
			}
		}
		for (int i = 1; i <= R - 2; ++i) {
			for (int j = 1; j <= C; ++j) {
				if (g[i][j] == 'C' && g[i + 1][j] == 'G' && g[i + 2][j] == 'C') {
					++ans;
					g[i + 1][j] = '.';
				}
			}
		}
		for (int i = 2; i <= R; ++i) {
			for (int j = 1; j < C; ++j) {
				if (g[i][j] == 'C' && g[i - 1][j + 1] == 'C') {
					if (g[i - 1][j] == 'G') {
						++ans;
						g[i - 1][j] = '.';
					} else if (g[i][j + 1] == 'G') {
						++ans;
						g[i][j + 1] = '.';
					}
				}
			}
			for (int j = 2; j <= C; ++j) {
				if (g[i][j] == 'C' && g[i - 1][j - 1] == 'C') {
					if (g[i - 1][j] == 'G') {
						++ans;
						g[i - 1][j] = '.';
					} else if (g[i][j - 1] == 'G') {
						++ans;
						g[i][j - 1] = '.';
					}
				}
			}
		}
		pr.println(ans);
		pr.close();
	}
}