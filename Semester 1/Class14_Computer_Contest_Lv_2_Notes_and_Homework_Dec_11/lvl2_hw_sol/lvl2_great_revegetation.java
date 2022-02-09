import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(), m = readInt(), ans[] = new int[n+1];
		List<Integer> lst[] = new ArrayList[n+1];
		for(int i=1; i<=n; i++) lst[i] = new ArrayList<>();
		for(int i=1; i<=m; i++) {
			int x = readInt(), y = readInt();
			lst[Math.max(x, y)].add(Math.min(x, y));
		}
		for(int i=1; i<=n; i++) {
			for(int k=1; k<=4; k++) {
				boolean flag = true;
				for(int x : lst[i])
					if(ans[x] == k) flag=false;
				if(flag) { ans[i] = k; break; }
			}
		}
		for(int i=1; i<=n; i++) System.out.print(ans[i]);
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