import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), x[] = new int[n], y[] = new int[n];
    	Map<String, Integer> map = new HashMap<>();
    	for(int i=0; i<n; i++) {
    		x[i] = readInt(); y[i] = readInt();
    		for(int j=0; j<i; j++) {
    			int mx = x[i] + x[j], my = y[i] + y[j];
    			long dis= (long)(x[i] - x[j])*(x[i] - x[j]) + (long)(y[i] - y[j])*(y[i] - y[j]);
    			String s = mx+","+my+","+dis;
    			map.put(s, map.getOrDefault(s, 0) + 1);
    		}
    	}
    	long ans = 0;
    	for(String key : map.keySet()) {
    		int val = map.get(key);
    		ans += (long)val * (val-1) / 2;
    	}
    	System.out.println(ans);
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