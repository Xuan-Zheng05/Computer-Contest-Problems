import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
		int K = readInt(), N = readInt();
		List<String> words [] = new ArrayList[26];
		for(int i=0; i<words.length; i++) {
			words[i] = new ArrayList();
		}
		for(int i=0; i<K; i++) {
			String s = next();
			words[s.charAt(0)-'a'].add(s);
		}
		for(int i=0; i<words.length; i++) {
			Collections.sort(words[i]);
		}
		int cur [] = new int[26];
		for(int i=0; i<N; i++) {
			int c = readCharacter() - 'a';
			System.out.println(words[c].get(cur[c]));
			cur[c] ++;
			if(cur[c] == words[c].size()) cur[c] = 0;
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