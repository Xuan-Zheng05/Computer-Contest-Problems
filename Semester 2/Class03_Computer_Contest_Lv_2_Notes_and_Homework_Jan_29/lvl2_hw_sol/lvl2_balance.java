import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = readLine();
		int sum = 0, min = Integer.MAX_VALUE;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '(') sum++;
			else sum--;
			min = Math.min(min, sum);
		}
		if((sum==0 && min>=0) || (sum==2 && min >= 0) || (sum==-2 && min >= -2)) 
			System.out.println("YES");
		else 
			System.out.println("NO");
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