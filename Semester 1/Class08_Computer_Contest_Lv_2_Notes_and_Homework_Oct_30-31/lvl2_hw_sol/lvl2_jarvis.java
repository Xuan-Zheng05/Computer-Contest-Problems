import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int N = readInt(), a[] = new int[N], b[] = new int[N];
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i<N; i++) {
			a[i] = readInt();
		}
		for(int i=0; i<N; i++) {
			b[i] = readInt();
			map.put(b[i] - a[i],  map.getOrDefault(b[i]-a[i], 0) + 1);
		}
		int ans = 0;
		for(int x : map.values()) {
			ans = Math.max(ans, x);
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