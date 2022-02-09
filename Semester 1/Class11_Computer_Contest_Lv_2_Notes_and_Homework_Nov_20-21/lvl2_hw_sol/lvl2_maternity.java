import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		char[] mom = readLine().toCharArray(), dad = readLine().toCharArray();
		int n= readInt();
		for(int k=1; k<=n; k++) {
			char [] kid = readLine().toCharArray();
			boolean flag = true;
			for(int i=0; i<kid.length; i++) {
				if(Character.isLowerCase(kid[i])) {
					if((Character.isLowerCase(mom[2*i]) || Character.isLowerCase(mom[2*i+1])) &&
						 (Character.isLowerCase(dad[2*i]) || Character.isLowerCase(dad[2*i+1]))) {
						
					}else {
						flag = false;
					}
				} else {
					if(Character.isUpperCase(mom[2*i]) || Character.isUpperCase(mom[2*i+1]) || 
						Character.isUpperCase(dad[2*i]) || Character.isUpperCase(dad[2*i+1])) {
						
					}else {
						flag = false;
					}
				}
			}
			if(flag) System.out.println("Possible baby.");
			else System.out.println("Not their baby!");
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