import java.io.*;
import java.time.Period;
import java.util.*;

public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static long p, y, t;
    public static void main(String[] args) throws IOException {
    	p = readLong(); y = readLong(); t = readLong();
    	long lo = 1, hi = t, ans = t;
    	while(lo <= hi) {
    		long mid = (lo + hi)/2;
    		if(check(mid)) { ans = mid; hi = mid - 1; }
    		else lo = mid + 1;
    	}
    	System.out.println(ans);
    }
    static boolean check(long n) {
    	long amount = 0;
    	for(int i=0; i<y; i++) {
    		amount += n;
    		amount += amount*p / 100;
    		if(amount >= t) return true;
    	}
    	return false;
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