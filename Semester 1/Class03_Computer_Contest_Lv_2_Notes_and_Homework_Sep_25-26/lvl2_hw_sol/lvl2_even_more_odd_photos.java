import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), odd = 0, even = 0;
		for(int i=1; i<=n; i++) {
			int x = readInt();
			if(x % 2 == 0) even++;
			else odd++;
		}
		if(odd < even) System.out.println(2*odd + 1);
		else if (odd == even) System.out.println(n);
		else {
			int dif = odd - even, rem = dif % 3;
			if(rem == 0)
				System.out.println(2*even + dif/3 * 2);
			if(rem == 1)
				System.out.println(2*even + dif/3 * 2 - 1);
			if(rem == 2)
				System.out.println(2*even + dif/3 * 2 + 1);
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