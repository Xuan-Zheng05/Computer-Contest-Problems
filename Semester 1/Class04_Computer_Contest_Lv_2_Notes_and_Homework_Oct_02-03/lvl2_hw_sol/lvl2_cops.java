import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int n = readInt(); 
		boolean [] guard = new boolean[n+1], first = new boolean[n+1];
		Deque<Integer> cop = new ArrayDeque(), unprotect = new ArrayDeque();
		for(int i=1; i<=n; i++) {
			int x = readInt();	
			if(!guard[x]) {
				guard[x] = true; first[i] = true; 
				cop.add(x);
			}
		}
		if(cop.size()==1) {
			System.out.println(-1);
			return;
		}
		for(int i=1; i<=n; i++) {
			if(!guard[i]) unprotect.add(i);
		}
		int x = cop.pollFirst(); cop.add(x);
		for(int i=1; i<=n; i++) {
			if(first[i]) System.out.print(cop.pollFirst() + " ");
			else System.out.print(unprotect.pollFirst() + " ");
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