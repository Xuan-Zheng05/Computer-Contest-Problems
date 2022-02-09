import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = readInt();
		}
		int left = 1, right = Integer.MAX_VALUE;
		for(int i=1; i<n; i++) {
			if(a[i-1]== 0 && a[i] == 0) continue;
			else if(a[i-1] != 0 && a[i] == 0) left = Math.max(left, a[i-1]);
			else if(a[i-1] == 0 && a[i] != 0) right = Math.min(right, a[i]);
			else if(a[i-1] > a[i]) {
				System.out.println("NO"); return; 
			}
		}
		System.out.println(left <= right? "YES" : "NO");
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