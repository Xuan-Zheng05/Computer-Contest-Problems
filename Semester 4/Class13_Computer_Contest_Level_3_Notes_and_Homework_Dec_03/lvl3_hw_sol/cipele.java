import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int n, m, lft[], rit[];
    public static void main(String[] args) throws IOException {
    	n = readInt(); m = readInt(); lft = new int[n]; rit = new int[m];
    	for(int i=0; i<n; i++) lft[i] = readInt();
    	for(int i=0; i<m; i++) rit[i] = readInt();
    	Arrays.sort(lft); Arrays.sort(rit);
    	int lo = 0, hi = (int)1e9, ans = 0;
    	while(lo <= hi) {
    		int mid = (lo + hi)/2;
    		if(check(mid)) { ans = mid; hi = mid - 1; }
    		else lo = mid + 1;
    	}
    	System.out.println(ans);
    }
    static boolean check(int limit) {
    	int pair = 0;
    	for(int i=0, j=0; i<n && j<m; ) {
    		if(Math.abs(lft[i] - rit[j]) <= limit) {
    			i++; j++; pair++;
    		}else if(lft[i] < rit[j]) {
    			i++;
    		}else j++;
    	}
    	return pair == Math.min(m, n);
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