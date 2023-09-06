import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), p[] = new int[n+1];
    	for(int i=1; i<=n; i++) p[i] = i;
    	for(int q = readInt(); q > 0; q--) {
    		char op = readCharacter(); int x = readInt(), y = readInt();
    		int fx = find_set(x, p), fy = find_set(y, p);
    		if(op == 'A') {
    			if(fx != fy) p[fx] = fy;
    		}else {
    			System.out.println(fx == fy? "Y" : "N");
    		}
    	}
    }
    static int find_set(int d, int p[]) {
    	if(d != p[d]) p[d] = find_set(p[d], p);
    	return p[d];
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