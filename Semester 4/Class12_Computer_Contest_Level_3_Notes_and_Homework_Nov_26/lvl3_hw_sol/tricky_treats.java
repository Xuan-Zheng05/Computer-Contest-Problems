import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String[] args) throws IOException{
    	int N = readInt(), M = readInt(), T = readInt();
    	List<pair> a = new ArrayList<>();
    	for(int i=0; i<N; i++) {
    		a.add(new pair(readInt(), readInt()));
    	}
    	Collections.sort(a, (x, y) -> Integer.compare(x.p, y.p));
    	int ans = 0, sum = 0;  
    	PriorityQueue<Integer> q = new PriorityQueue();
    	for(pair e : a) {
    		if(e.p * 2 + T > M) break;
    		sum += e.val;  q.add(e.val);
    		int k = (M - 2*e.p) / T;
    		while(q.size() > k) {
    			sum -= q.poll();
    		}
    		ans = Math.max(ans, sum);
    	}
    	System.out.println(ans);
    }
    static class pair {
    	int p, val;
    	pair(int p0, int v0) {p = p0; val = v0; }
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