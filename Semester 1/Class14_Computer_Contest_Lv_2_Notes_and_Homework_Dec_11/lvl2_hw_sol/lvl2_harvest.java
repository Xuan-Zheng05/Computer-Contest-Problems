import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int N = readInt(), M = readInt(); long K = readLong();
		long dif[] = new long[N+2], psa[] = new long[N+2];
		for(int i=1; i<=M; i++) {
			int x = readInt(), y = readInt(); 
			dif[x]--; dif[y+1]++; 
		}
		for(int i=1; i<=N; i++) {
			dif[i] += dif[i-1]; psa[i] = psa[i-1] + M + dif[i];
		}
		int ans = N+1;
		for(int L=0, R=1; R<=N; R++) {
			while(L<=R && psa[R] - psa[L] >= K) {
				ans = Math.min(ans, R-L); L++;
			}
		}
		if(ans <= N) System.out.println(ans);
		else System.out.println(-1);
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