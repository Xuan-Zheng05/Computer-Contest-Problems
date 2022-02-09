import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		String s = readLine(); int Q = readInt(), N = s.length();
		int psa[][] = new int[2][N+1];
		for(int i=1; i<=N; i++) {
			psa[0][i] = psa[0][i-1]; psa[1][i] = psa[1][i-1];
			if(s.charAt(i-1)=='0') psa[0][i]++;
			if(s.charAt(i-1)=='1') psa[1][i]++;
		}
		for(int i=1; i<=Q; i++) {
			int start = readInt(), occur = readInt(), d = readInt();
			int val = psa[d][start-1] + occur;
			int pos = lower_bound(psa[d], val);
			System.out.println(pos>N? -1 : pos);
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