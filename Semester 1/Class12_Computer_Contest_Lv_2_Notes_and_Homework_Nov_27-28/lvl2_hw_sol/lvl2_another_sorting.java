import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(); Integer a[] = new Integer[n];
		for(int i=0; i<n; i++) {
			a[i] = readInt();
		}
		Arrays.sort(a, new cmp());
		for(int i=0; i<n; i++)
			System.out.print(a[i] + " ");
	}
	static class cmp implements Comparator<Integer> {
		public int compare(Integer a, Integer b) {
			int da = a % 10, db = b % 10;
			if(da != db) return Integer.compare(da, db);
			return -Integer.compare(a, b);
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