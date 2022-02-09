import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n  = readInt(); Map<String, String> book = new HashMap();
		for(int i=0; i<n; i++) {
			String name = next(), phone = next();
			book.put(phone, name);
		}
		int d = readInt(); Map<String, Integer> freq = new TreeMap();
		for(int i=0; i<d; i++) {
			String phone = next();
			freq.put(phone, freq.getOrDefault(phone, 0)+1);
		}
		int max = 0; String phone = "";
		for(String key : freq.keySet()) {
			if(freq.get(key) > max) {
				max = freq.get(key);
				phone = key;
			}
		}
		System.out.println(book.get(phone));
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