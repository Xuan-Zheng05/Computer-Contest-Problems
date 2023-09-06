import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), a[][] = new int[n][n];
		for(int i=0; i<n; i++) {
			char [] s = readLine().toCharArray();
			for(int j=0; j<n; j++) {
				if(s[j] >= '0' && s[j] <= '9') a[i][j] = s[j] - '0';
				else a[i][j] = s[j] - 'A' + 10;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if( (k!=j && a[i][k] == a[i][j]) || (k!=i && a[k][j] == a[i][j])) {
						System.out.println("No"); return;
					}
				}
			}
		}
		for(int i=1; i<n; i++) {
			if(a[0][i-1] >= a[0][i] || a[i-1][0] >= a[i][0]) {
				System.out.println("Latin"); return;
			}
		}
		System.out.println("Reduced");
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