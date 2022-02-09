import java.util.*;
import java.io.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
        int n = readInt();
        int[] s = new int[n+1];
        int[] b = new int[n];
        for(int i = 0; i < n+1; i++) {
            s[i] = readInt();
        }
        for(int i = 0; i < n; i++) {
            b[i] = readInt();
        }

        double ans = 0;
        for(int i = 0; i < n; i++) {
            ans += (double)(s[i] + s[i+1]) * b[i] / 2;
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