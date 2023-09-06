import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st; 
	public static void main(String[] args) throws IOException {
		int n = readInt(); String s = readLine();
		int p1 = s.indexOf("1"), pn = s.lastIndexOf("1");
		if(p1 < 0) { System.out.println(n-1); return; }
		List<Integer> d1 = new ArrayList<>(), d2 = new ArrayList<>(); int exist = n;
		d1.add(p1); d1.add(n-1-pn);
		d2.add(p1/2); d2.add((n-1-pn)/2);
		for(int cur = p1, nxt = 0; cur < pn; cur = nxt) {
			nxt = s.indexOf("1", cur+1);   exist = Math.min(exist, nxt - cur);
			d1.add((nxt - cur)/2);  d2.add((nxt-cur)/3);
		}
		Collections.sort(d1); Collections.sort(d2);
		System.out.println(Math.min(exist, Math.max(d1.get(d1.size()-2), d2.get(d2.size()-1))));
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