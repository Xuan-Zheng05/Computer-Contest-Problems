import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(), a[] = new int[n];
		assert n <= 20;
		for(int i=0; i<n; i++) {
			a[i] = readInt();
		}
		Arrays.sort(a);
		System.out.print(a[0] + " " + a[n-1] + " ");
		f(0, n/2, a); f(0, n, a); f((n+1)/2, n/2, a);
	}
	static void f(int start, int size, int a[]) {
		if(size % 2 != 0) {
			System.out.print(a[start + size/2] + " ");
		}else {
			System.out.print((a[start + size/2 - 1] + a[start + size/2])/2.0 + " ");
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