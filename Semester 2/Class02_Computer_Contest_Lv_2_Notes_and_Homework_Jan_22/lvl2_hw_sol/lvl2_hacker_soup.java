import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String args[]) throws IOException{
    	int N = readInt(), K = readInt(), Q = readInt();
    	int [] top = new int[K], bot = new int[K], lft = new int[K], rit = new int[K];
    	for(int i=0; i<K; i++) {
    		top[i] = readInt(); lft[i] = readInt(); bot[i] = readInt(); rit[i] = readInt();
    	}
    	for(int i=0; i<Q; i++) {
    		int r = readInt(), c = readInt();
    		for(int j=K-1; j>=0; j--) {
    			if(top[j] <= r && r <= bot[j] && lft[j] <= c && c <= rit[j]) {
    				int  oldc = r + lft[j] - top[j], oldr = rit[j] - c + top[j];
    				r = oldr;  c = oldc;
    			}
    		}
    		System.out.println((long)(r-1)*N+c);
    	}
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
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}