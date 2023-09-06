import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), freq[] = new int[1001];
    	int mx = 0, mx2 = 0;
    	for(int i=1; i<=n; i++) {
    		int x = readInt(); freq[x] ++;
    		mx = Math.max(mx, freq[x]);
    	}
    	List<Integer> t = new ArrayList();
    	for(int i=1; i<freq.length; i++) {
    		if(freq[i] == mx) t.add(i);
    		if(freq[i] < mx && freq[i] > mx2) mx2 = freq[i];
    	}
    	if(t.size() != 1) {
    		System.out.println(t.get(t.size()-1) - t.get(0));
    		return;
    	}
    	int high = t.get(0);  t.clear();
    	for(int i=1; i<freq.length; i++) {
    		if(freq[i] == mx2) t.add(i);
    	}
    	int small = Math.abs(high - t.get(0));
    	int big = Math.abs(high - t.get(t.size()-1));
    	System.out.println(Math.max(small, big));
    	
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