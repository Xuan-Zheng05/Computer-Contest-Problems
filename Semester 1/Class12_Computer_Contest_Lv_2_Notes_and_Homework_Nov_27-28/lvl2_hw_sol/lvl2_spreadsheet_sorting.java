import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	static int R, C, N, a[][], col;
	public static void main(String[] args) throws IOException{	
		R = readInt(); C = readInt(); a=new int[R][C];
		Integer row[] = new Integer[R];
		for(int i=0; i<R; i++) {
			row[i] = i;
			for(int j=0; j<C; j++) {
				a[i][j] = readInt();
			}
		}
		N = readInt();
		for(int i=0; i<N; i++) {
			col = readInt() - 1;
			Arrays.sort(row, new cmp());
		}
		for(int i=0; i<R; i++) {
			int r = row[i];
			for(int j=0; j<C; j++) {
				System.out.print(a[r][j] + " ");
			}
			System.out.println();
		}
	}
	static class cmp implements Comparator<Integer> {
		public int compare(Integer x, Integer y) {
			return Integer.compare(a[x][col], a[y][col]);
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