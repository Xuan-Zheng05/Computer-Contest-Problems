import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), ans = 0;
		String s = in.next(), t = in.next();
		boolean []dif = new boolean[n];
		for(int i=0; i<n; i++) {
			if(s.charAt(i) != t.charAt(i)) {
				dif[i] = true;
				if(i==0 || !dif[i-1]) ans++;
			}
		}
		System.out.println(ans);
	}

}