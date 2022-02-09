import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(); pair cow[] = new pair[n];
		for(int i=0; i<n; i++) {
			cow[i] = new pair(readInt(), readInt());
		}
		Arrays.sort(cow);
		int R = n+1;
		for(int i=1; i<n; i++) {
			if(cow[i-1].sick != cow[i].sick) R = Math.min(R, cow[i].loc - cow[i-1].loc);
		}
		int cnt = 0, last = -1;
		for(int i=0; i<n; i++) {
			if(cow[i].sick == 1) {
				if(last==-1 || cow[i].loc - last >= R) { cnt++; }
				last = cow[i].loc;
			}
		}
		System.out.println(cnt);
	}
	static class pair implements Comparable<pair>{
		int loc, sick;
		pair(int x, int y) { loc = x; sick = y; }
		public int compareTo(pair x) { return Integer.compare(loc, x.loc); }
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong() throws IOException {
		return Long.parseLong(next());
	}
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}

	static double readDouble() throws IOException {
		return Double.parseDouble(next());
	}

	static char readCharacter() throws IOException {
		return next().charAt(0);
	}

	static String readLine() throws IOException {
		return br.readLine().trim();
	}
}