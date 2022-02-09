import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int maxV = (int)1e5, f[] = new int[maxV + 1]; List<Integer> list[] = new ArrayList[maxV+1];
		for(int i=1; i<=maxV; i++) {
			list[i] = new ArrayList();
			for(int j=i; j<=maxV; j+=i) {
				f[j]++;
			}
			list[f[i]].add(i);
		}
		for(int T = readInt(); T > 0; T--) {
			int k = readInt(), a = readInt(), b = readInt();
			int pa = Collections.binarySearch(list[k], a), pb = Collections.binarySearch(list[k], b);
			if(pa < 0) pa = -pa - 1;  //insertion point >= a
			if(pb < 0) pb = -pb - 2;  // last one <= b
			System.out.println(pb - pa + 1);
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