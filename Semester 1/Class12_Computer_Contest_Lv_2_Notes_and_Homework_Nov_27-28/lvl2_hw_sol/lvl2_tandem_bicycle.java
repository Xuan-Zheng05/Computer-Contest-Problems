import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		 int n = readInt(), w = readInt();
		 int a[] = new int[n];
		 for(int i=0; i<n; i++) {
			 a[i] = readInt();
		 }
		 Arrays.sort(a);
		 long ans = 0;
		 for(int L=0, R=n-1; L<R; ) {
			 if(a[L] + a[R] <= w) {
				 ans += R - L;  L++;
			 }else {
				 R --;
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