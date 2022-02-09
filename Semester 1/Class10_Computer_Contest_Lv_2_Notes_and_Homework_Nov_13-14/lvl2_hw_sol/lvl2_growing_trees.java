import java.io.*;
import java.util.*;
public class homework {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt(), h[] = new int[n], s[] = new int[n], ans = Integer.MAX_VALUE;
    	for(int i=0; i<n; i++){
    		h[i] = in.nextInt(); s[i] = in.nextInt();
    		for(int j=0; j<i; j++){
    			int dh = h[i]-h[j], ds = s[i] - s[j];
    			if(dh * ds > 0) continue;
    			if(dh == 0) ans = 0;
    			if(ds != 0 && dh % ds == 0) ans = Math.min(ans, -dh / ds);
    		}
    	}
    	if(ans == Integer.MAX_VALUE) System.out.println(-1);
    	else System.out.println(ans);
    }
}