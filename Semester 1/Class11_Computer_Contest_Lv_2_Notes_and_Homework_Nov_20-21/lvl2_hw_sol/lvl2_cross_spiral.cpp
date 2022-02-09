import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int C = readInt(), R = readInt(), X = readInt(), Y = readInt(), step = readInt(), vis[][] = new int[R+1][C+1];
		for(int i=1; i<=R; i++) 
			for(int j=1; j<=C; j++) 
				if((i<=Y && (j <= X || C-X<j)) || (R-Y < i && (j<=X || C-X<j))) vis[i][j]=-1;
		int curR = 1, curC = X+1, curD=2, dir[][]= {{0,-1}, {-1,0}, {0,1}, {1,0}}; //left, up, right, down 
		for(int t=1; t<=step; t++) {
			vis[curR][curC] = 1;  //print(vis, t);
			curD = (curD + 2) % 4; boolean stuck = true;
			for(int k=0; k<3; k++) {
				curD = (curD + 1) % 4;
				int nr = curR + dir[curD][0], nc = curC + dir[curD][1];
				if(nr >= 1 && nr <= R && nc >=1 && nc<=C && vis[nr][nc]==0) {
					curR = nr; curC = nc;  stuck = false;
					break;
				}
			}
			if(stuck) break;
		}
		System.out.println(curC + "\n" + curR);
	}
//	static void print(int vis[][], int t) {
//		System.out.println("================" + t + "===================");
//		int R = vis.length-1, C = vis[0].length-1;
//		for(int i=1; i<=R; i++) {
//			for(int j=1; j<=C; j++) {
//				if(vis[i][j]==1) System.out.print("#");
//				else if(vis[i][j]==0) System.out.print(".");
//				else System.out.print("X");
//			}
//			System.out.println();
//		}
//	}
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