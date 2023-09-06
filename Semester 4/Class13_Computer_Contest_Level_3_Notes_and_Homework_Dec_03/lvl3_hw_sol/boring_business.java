import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	static int r = 0, c = 0;
	static int[][] arr = new int[205][405];
	static boolean safe = true;
	public static void main(String[] args) throws IOException{
        drill('d', 3);  drill('r', 3); drill('d', 2); drill('r', 2); drill('u', 2); drill('r', 2); 
        drill('d', 4); drill('l', 8); drill('u', 2);
        while(safe){
            char direction = readCharacter();
            int stp = readInt();
            if(direction == 'q') break;
            else{
                 drill(direction, stp);
                 System.out.print(c + " " + r);
                 if(safe){
                     System.out.println(" safe");
                 }else System.out.println(" DANGER");
            }
	    }
	}
	static void drill(char dir, int step){
	    int dr = 0, dc = 0;
	    if(dir == 'd') dr=-1;
	    if(dir == 'u') dr=1;
	    if(dir == 'l') dc=-1;
	    if(dir == 'r') dc=1;
	    for(int i = 0; i < step; i++){
	        r += dr;
	        c += dc;
	        if(arr[r+200][c+200] != 0){
	            safe = false;
	        }else{
	            arr[r+200][c+200]=1;
	        }
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