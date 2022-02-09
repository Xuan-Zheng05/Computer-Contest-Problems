import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int Q = readInt(); Deque<pair> dq = new LinkedList();
		Map<Integer, Integer> rem = new HashMap();
		for(int i=1; i<=Q; i++) {
			char op = readCharacter(); int x = readInt();
			if(op == 'F') {
				dq.addFirst(new pair(x, i));
			}else if(op == 'E') {
				dq.addLast(new pair(x, i));
			}else {
				rem.put(x, i);
			}
		}
		for(pair e: dq) {
			if(!rem.containsKey(e.val) || rem.get(e.val) < e.idx) {
				System.out.println(e.val);
			}
		}
	}
	static class pair {
		int val, idx;
		pair(int v0, int i0){ val = v0; idx = i0; }
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