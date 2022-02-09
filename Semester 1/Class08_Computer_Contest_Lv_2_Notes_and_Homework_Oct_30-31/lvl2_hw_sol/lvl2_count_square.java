import java.util.*;
import java.io.*;
public class lvl2_count_square {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
   
		int h = readInt(), v = readInt();
      int y[] = new int[h], x[] = new int[v];
		HashMap<Integer, Integer> map = new HashMap<>();
      
		for(int i=0; i<h; i++) {
			y[i] = readInt();
		}
      
		for(int i=0; i<h; i++) {
			for(int j=i+1; j<h; j++) {  //map[ y[j] - y[i] ]  = 5 
				if(!map.containsKey(y[j] - y[i])) {
					map.put(y[j] - y[i], 1);
				}else {
					map.put(y[j] - y[i], map.get(y[j] - y[i])+1);
				}
			}
		}
      
		long ans = 0;
		for(int i=0; i<v; i++) {
			x[i] = readInt();
			for(int j=0; j<i; j++) {
				ans += map.getOrDefault(x[i] - x[j], 0);
			}
		} 
		System.out.println(ans);
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