import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), x[] = new int[n], y[] = new int[n]; 
		Map<point, Integer> map = new HashMap();
		for(int i=0; i<n; i++) {
			x[i] = readInt(); y[i] = readInt();
		}
		long ans = 0;
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				int xm = x[i] + x[j], ym = y[i] + y[j]; 
				long dis = (long)(x[i] - x[j])*(x[i] - x[j]) + (long)(y[i] - y[j])*(y[i] - y[j]);
				point cur = new point(xm, ym, dis); int cnt = map.getOrDefault(cur, 0);
				ans += cnt;
				map.put(cur, cnt+1);
			}
		}
		System.out.println(ans);
	}
	static class point {
		int x, y; long dis;
		point(int x0, int y0, long d0) { x = x0; y = y0; dis = d0; }
		public int hashCode() { return Objects.hash(x, y, dis); }
		public boolean equals(Object a) {
			point pa = (point)a;
			return x==pa.x && y==pa.y && dis == pa.dis;
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