import java.util.*;
import java.io.*;
public class homework {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st; 
    public static void main(String[] args) throws IOException{
    	int n = readInt(), sz = 1004, cnt[][] = new int[sz][sz];
    	boolean cow[][] = new boolean[sz][sz];
    	int ans = 0, dir[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    	for(int i=1; i<=n; i++) {
    		int r = readInt() + 1, c = readInt() + 1;
    		cow[r][c] = true;
    		if(cnt[r][c] == 3) ans++;
    		for(int k=0; k < 4; k++) {
    			int nr = r + dir[k][0], nc = c + dir[k][1];
    			cnt[nr][nc] ++;
    			if(cnt[nr][nc] == 3 && cow[nr][nc]) ans++;
    			if(cnt[nr][nc] == 4 && cow[nr][nc]) ans--;
    		}
    		System.out.println(ans);
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