import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int st = readInt(), ed = readInt(), a[][] = new int[15][15], r = 7, c = 7;
		int dir[][] = {{1,0}, {0, 1}, {-1,0}, {0,-1}}, step = 1, turn = 0, d = 0, cnt=0; //D, R, U, L
		int top = r, bot = r, lft = c, rit = c;
		a[r][c] = st;
		for(int i=st+1; i<=ed; ) {
			if(cnt < step) {
				r += dir[d][0]; c += dir[d][1];
				a[r][c] = i; cnt++; i++;
				top = Math.min(top, r); bot = Math.max(bot, r);
				lft = Math.min(lft, c); rit = Math.max(rit, c);
			}else {
				d = (d + 1) % 4; cnt = 0; turn++;
				if(turn == 2) { step++; turn = 0; }
			}
		}
		for(int i=top; i<=bot; i++) {
			for(int j=lft; j<=rit; j++) {
				if(a[i][j] != 0) {
					if(a[i][j] >= 10) System.out.print(a[i][j] + " ");
					else System.out.print(" " + a[i][j] + " ");
				}else System.out.print("   ");
			}
			System.out.println();
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