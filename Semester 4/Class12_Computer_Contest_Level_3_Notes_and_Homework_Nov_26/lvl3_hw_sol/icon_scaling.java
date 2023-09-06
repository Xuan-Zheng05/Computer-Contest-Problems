import java.io.*;
import java.time.Period;
import java.util.*;


public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    
    public static void main(String[] args) throws IOException {
    	String g[][] = {{"*", "x", "*"}, {" ", "x", "x"}, {"*", " ", "*"}};
    	int k = readInt();
    	for(int i=0; i<3; i++) {
    		String row = "";
    		for(int j=0; j<3; j++) {
    			for(int p=0; p<k; p++) {
    				row += g[i][j];
    			}
    		}
    		for(int p=0; p<k; p++) {
    			System.out.println(row);
    		}
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

    static char readCharacter() throws IOException {
        return next().charAt(0);
    }

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}