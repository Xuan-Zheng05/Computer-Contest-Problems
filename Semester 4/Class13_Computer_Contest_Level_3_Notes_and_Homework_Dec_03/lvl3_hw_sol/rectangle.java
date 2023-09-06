import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
    public static void main(String[] args) throws IOException {
    	int n = readInt(), x[] = new int[n], y[] = new int[n];
    	int ans = 0;  Set<String> set = new HashSet<>();
    	for(int i=0; i<n; i++) {
    		x[i] = readInt(); y[i] = readInt();
    		set.add(x[i] + "," + y[i]);
    	}
    	for(int i=0; i<n; i++) {
    		for(int j=i+1; j<n; j++) {
    			if(set.contains(x[i]+","+y[j]) 
    					&& set.contains(x[j]+","+y[i])) {
    				ans = Math.max(ans, Math.abs(x[i]-x[j])*Math.abs(y[i]-y[j]));
    			}
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