import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(), q = readInt(), a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = readInt();
		}
		Arrays.sort(a);
		for(int i=0; i<q; i++) {
			int lo = readInt(), hi = readInt();
			System.out.println(upper_bound(a, hi) - lower_bound(a, lo));
		}
	}
	static int upper_bound(int a[], int x) {
		//return 1st element > x. if no such element, return a.length
		int lo = 0, hi = a.length-1, ans = a.length;
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(a[mid] > x) { ans = mid; hi = mid - 1; }
			else lo = mid + 1;
		}
		return ans;
	}
	static int lower_bound(int a[], int x) {
		//return 1st element >= x. if no such element, return a.length
		int lo = 0, hi = a.length-1, ans = a.length;
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			if(a[mid] >= x) { ans = mid; hi = mid - 1; }
			else lo = mid + 1;
		}
		return ans;
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