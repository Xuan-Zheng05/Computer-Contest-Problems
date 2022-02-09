import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int M = readInt(), N = readInt(), K = readInt(), h [] = new int[K];
		for(int i=0; i<K; i++) {
			h[i] = readInt();
		}
		Arrays.sort(h);
		long ans = 0;
		for(int lo=0, hi=K-1; lo <= hi; ) {
			int front = h[hi];  hi--;
			for(int r=1;  lo<=hi && r<M; r++) {
				ans += front - h[lo] + r;
				lo++;
			}
		}
		System.out.println(ans);
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