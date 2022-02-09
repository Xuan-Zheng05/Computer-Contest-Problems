import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(), k = readInt(), ans[] = new int[n+1];
		int a1 = readInt(), a2 = readInt(), b1 = readInt(), b2 = readInt();
		for(int i=1; i<=n; i++) {
			if((a1 <= i && i<=a2) || (b1<=i && i<=b2)) {
				List<Integer> list = new ArrayList(); int cur = i;
				while(list.isEmpty() || cur != i) {
					list.add(cur); 
					if(a1 <= cur && cur<=a2) cur = a1 + a2 - cur;
					if(b1 <= cur && cur<=b2) cur = b1 + b2 - cur;
				}
				int rem = k % list.size(), pos = list.get(rem);
				ans[pos] = i;
			}else ans[i] = i;
		}
		for(int i=1; i<=n; i++) System.out.println(ans[i]);
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