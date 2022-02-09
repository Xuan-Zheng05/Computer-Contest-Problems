import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{	
	    int n = readInt(); boolean vis[] = new boolean[26];
	    String t[] = {"***ABCDE", "FGHIJKLM", "NOPQRSTU", "VWXYZ***"};
	    List<String> dest = new ArrayList<>();
	    for(int i=0; i<n; i++){
	    	dest.add(readLine());
	    }
	    String s = readLine();
	    for(String x : dest){
	        if(x.length()> s.length() && x.startsWith(s)){
	            vis[x.charAt(s.length())-'A'] = true;
	        }
	    }
	    for(int i=0; i<t.length; i++) {
	        for(int j = 0; j<t[i].length(); j++){
	        	char c = t[i].charAt(j);
	            if(c == '*' || !vis[c-'A']) System.out.print("*");
	            else System.out.print(c);
	        }
	        System.out.println();
	    }
	}
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
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