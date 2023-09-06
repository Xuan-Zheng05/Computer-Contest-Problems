import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	List<String> clockwise = new ArrayList(Arrays.asList("NE", "ES", "SW", "WN"));
    	for(int n=readInt(); n>0; n--) {
    		String s = readLine(); int cw = 0, ccw=0;
    		for(int i=1; i<s.length(); i++) {
    			if(s.charAt(i-1) == s.charAt(i)) continue;
    			String turn = s.substring(i-1, i+1);
    			if(clockwise.contains(turn)) cw++;
    			else ccw++;
    		}
    		System.out.println(cw > ccw? "CW" : "CCW");
    	}
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