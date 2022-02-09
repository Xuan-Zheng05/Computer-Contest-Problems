import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(); long m = readLong(), psa[] = new long[n+1];
		for(int i=1; i<=n; i++) {
			psa[i] = psa[i-1] + readLong();
		}
		int ans = n+1;
		for(int L=1, R=1; R<=n; R++) {
			while(psa[R] - psa[L-1] >= m) {
				ans = Math.min(ans, R-L+1);
				L++;
			}
		}
		System.out.println(ans > n? -1 : ans);
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