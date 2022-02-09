import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		for(int T = readInt(); T > 0; T--) {
			int n = readInt(), k = readInt();
			Map<String, Integer> map = new HashMap();
			for(int i=0; i<n; i++) {
				String word = next(); map.put(word, map.getOrDefault(word, 0) + 1);
			}
			List<pair> words = new ArrayList();
			for(String key: map.keySet()) words.add(new pair(key, map.get(key)));
			Collections.sort(words);
			String ordinal = getOrdinal(k);
			System.out.println(k + ordinal + " most common word(s):");
			if(k > words.size()) { continue; }
			if(k == 1 || words.get(k-1).cnt < words.get(k-2).cnt) {
				for(int i=k-1; i < words.size() && words.get(i).cnt == words.get(k-1).cnt; i++)
					System.out.println(words.get(i).word);
			}
			System.out.println();
		}
	}
	static String getOrdinal(int k) {
		if(k % 100 >= 11 && k % 100 <= 13) return "th";
		if(k % 10 == 1) return "st";
		if(k % 10 == 2) return "nd";
		if(k % 10 == 3) return "rd";
		return "th";
	}
	static class pair implements Comparable<pair>{
		String word; int cnt;
		pair(String s, int n) { word = s; cnt = n; }
		public int compareTo(pair x) { return -Integer.compare(cnt, x.cnt); }
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