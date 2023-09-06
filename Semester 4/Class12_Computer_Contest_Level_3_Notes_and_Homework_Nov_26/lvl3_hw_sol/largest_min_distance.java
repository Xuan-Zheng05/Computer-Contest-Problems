import java.io.*;
import java.time.Period;
import java.util.*;

public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int n, m, a[];
    public static void main(String[] args) throws IOException {
    	n = readInt(); m = readInt(); a = new int[n];
    	for(int i=0; i<n; i++) a[i] = readInt();
    	Arrays.sort(a);
    	int lo = 1, hi = a[n-1], ans = 0;
    	while(lo <= hi) {
    		int mid = (lo + hi)/2;
    		if(check(mid)) { ans = mid; lo = mid + 1; }
    		else hi = mid - 1;
    	}
    	System.out.println(ans);
    }
    static boolean check(int x) {
    	int last = a[0], cnt = 1;
    	for(int i=1; i<n; i++) {
    		if(a[i] - last >= x) {
    			last = a[i]; cnt++;
    		}
    	}
    	return cnt >= m;
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