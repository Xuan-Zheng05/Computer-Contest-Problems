import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(); String s = readLine();
		int first = s.indexOf("1"), last = s.lastIndexOf("1");
		if(first < 0) { System.out.println(n-1); return; }
		List<Integer> dis = new ArrayList();  //each new cow in a separate interval
		List<Integer> dis2 = new ArrayList(); //two new cows in the same interval
		int dis3 = Integer.MAX_VALUE;
		dis.add(first); dis.add(n-1-last); dis2.add(first/2); dis2.add((n-1-last)/2); 
		for(int cur = first, nxt = 0; cur < last; cur = nxt) {
			nxt = s.indexOf("1", cur+1);  dis3 = Math.min(dis3, nxt - cur);
			dis.add((nxt - cur)/2);
			dis2.add((nxt - cur)/3);
		}
		Collections.sort(dis);  Collections.sort(dis2);
		System.out.println(Math.min(dis3, Math.max(dis.get(dis.size()-2), dis2.get(dis2.size()-1))));
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