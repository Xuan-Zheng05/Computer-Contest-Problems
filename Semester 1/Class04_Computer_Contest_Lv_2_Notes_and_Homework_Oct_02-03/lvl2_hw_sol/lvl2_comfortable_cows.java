import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(), sz = 1000;
		int [][] grid = new int[sz+4][sz+4], dif = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
		boolean [][] cow = new boolean[sz+4][sz+4];
		int ans = 0;
		for(int i=0; i<n; i++) {
			int x = readInt() + 1, y = readInt() + 1;
			cow[x][y] = true;
			//(x-1, y)  (x+1, y) (x, y-1)  (x, y+1)
			for(int k=0; k<4; k++) {
				int nx = x + dif[k][0], ny = y + dif[k][1];
				grid[nx][ny]++;
				if(grid[nx][ny] == 3 && cow[nx][ny]) ans++;
				if(grid[nx][ny] == 4 && cow[nx][ny]) ans--;
			}
			System.out.println(ans);
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