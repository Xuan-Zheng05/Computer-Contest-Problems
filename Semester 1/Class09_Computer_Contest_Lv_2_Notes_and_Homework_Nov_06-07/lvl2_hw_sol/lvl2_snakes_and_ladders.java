import java.util.*;
import java.io.*;
public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
	    int cur = 1, lad_snk[] = {54, 90, 99, 9, 40, 67}, next[] = {19, 48, 77, 34, 64, 86};
	    while(true) {
	    	int dice = readInt();
	    	if(dice == 0) break;
	        if(cur + dice <= 100)
	            cur += dice;
	        for(int i=0; i<lad_snk.length; i++) {
	        	if(lad_snk[i] == cur) {
	        		cur = next[i];
	        	}
	        }
	        System.out.println("You are now on square " + cur);
	        if(cur == 100){
	        	System.out.println("You Win!");
	        	return;
	        }
	    }
	    System.out.println("You Quit!");
	}
	static String next() throws IOException {
		while (st == null || !st.hasMoreTokens()) 
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	
	static int readInt() throws IOException {
		return Integer.parseInt(next());
	}
}