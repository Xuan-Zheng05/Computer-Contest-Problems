import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		String s = readLine(); int psa[][]=new int[2][s.length()+1];
		for(int i=0; i<s.length(); i++){
			psa[s.charAt(i) - '0'][i+1]++;
			psa[0][i+1] += psa[0][i]; psa[1][i+1] += psa[1][i];
		}
		int Q = readInt();
		for(int i=1; i<=Q; i++){
			int x = readInt(), y = readInt(), z = readInt();
			int p = Arrays.binarySearch(psa[z], x, psa[z].length, psa[z][x-1]+y);
			if(p < 0) System.out.println(-1);
			else{
				for(int j=p; j>0; j--){
					if(psa[z][j] != psa[z][j-1]){
						System.out.println(j); break;
					}
				}
			}
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