import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt();
		for(int t=0; t<n; t++) {
			String s = readLine();
			int cw = 0, ccw = 0;
			for(int i=0; i<s.length()-1; i++) {
				String sub = s.substring(i, i+2); //get [i, i+1]
				if(sub.equals("NE") || sub.equals("ES") || sub.equals("SW") || sub.equals("WN")) {
					cw++;
				}
				if(sub.equals("NW") || sub.equals("EN") || sub.equals("SE") || sub.equals("WS")) {
					ccw++;
				}				
			}
			if(cw > ccw) System.out.println("CW");
			else System.out.println("CCW");
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