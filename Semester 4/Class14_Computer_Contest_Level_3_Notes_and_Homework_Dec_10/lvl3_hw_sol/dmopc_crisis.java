import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), times = n / 4,  rem = n % 4;
    	int cnt = 2*times;
    	if(rem == 3) cnt++;
    	System.out.println(cnt);
    	for(int k=1; k<=times; k++) {
    		System.out.print("MM__");
    	}
    	if(rem == 1) System.out.println("_");
    	if(rem == 2) System.out.println("__");
    	if(rem == 3) System.out.println("M__");
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