import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s[] = readLine().split(":");
		int h = Integer.parseInt(s[0]), m = Integer.parseInt(s[1]), cur = h*60 + m;
		for(int i=1; i<=120; i++) {
			if((cur >= 7*60 && cur < 10*60) || (cur >= 15*60 && cur < 19*60)) {
				cur += 2;
			}else {
				cur += 1;
			}
		}
		h = cur / 60 % 24; m = cur % 60;
		System.out.printf("%02d:%02d\n", h, m);
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