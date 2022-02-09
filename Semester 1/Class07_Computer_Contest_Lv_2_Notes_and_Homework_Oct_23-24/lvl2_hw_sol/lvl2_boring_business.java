import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static boolean vis[][] = new boolean[200][401];  static int curR = 0, curC = 0;
	public static void main(String[] args) throws IOException{
		drill('d', 3); drill('r', 3); drill('d', 2); drill('r', 2); drill('u', 2); drill('r', 2);
		drill('d', 4); drill('l', 8); drill('u', 2);
		while(true) {
			char dir = readCharacter(); int len = readInt();
			if(dir == 'q') break;
			if(drill(dir, len)) System.out.println(curC + " " + curR + " safe");
			else {  System.out.println(curC + " " + curR + " DANGER"); break; }
		}
	}
	static boolean drill(char direction, int length) {
		int dr = 0, dc = 0; boolean safe = true;
		if(direction == 'u') dr = 1;
		if(direction == 'd') dr = -1;
		if(direction == 'l') dc = -1;
		if(direction == 'r') dc = 1;
		for(int i=0; i<length; i++) {
			curR += dr; curC += dc;
			if(vis[curR+200][curC+200]) safe = false;
			vis[curR+200][curC+200] = true;
		}
		return safe;
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