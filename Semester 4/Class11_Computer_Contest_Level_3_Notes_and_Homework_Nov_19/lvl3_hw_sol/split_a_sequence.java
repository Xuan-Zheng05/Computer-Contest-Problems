import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    static int n, m, a[];
    public static void main(String[] args) throws IOException{
    	n = readInt(); m = readInt();  a = new int[n];
    	long lo = 0, hi = 0;
    	for(int i=0; i<n; i++) {
    		a[i] = readInt();
    		lo = Math.max(lo, a[i]); hi += a[i];
    	}
    	long ans = 0;
    	while(lo <= hi) {
    		long mid = (lo + hi)/2;
    		if(check(mid)) { ans = mid; hi = mid - 1;}
    		else lo = mid + 1;
    	}
    	System.out.println(ans);
    }
    static boolean check(long x) {
    	long sum = 0; int cnt = 1;
    	for(int i=0; i<n; i++) {
    		if(sum + a[i] > x) {
    			sum = a[i]; cnt ++;
    		}else {
    			sum += a[i];
    		}
    	}
    	return cnt <= m;
    }
    static String next () throws IOException {
        while (st == null || ! st.hasMoreTokens())
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