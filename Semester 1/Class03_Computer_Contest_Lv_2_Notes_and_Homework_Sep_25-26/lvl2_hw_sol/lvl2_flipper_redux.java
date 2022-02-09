import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); boolean [][] a = new boolean[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++)
				a[i][j] = (in.nextInt() == 1);
		}
		List<String> ans = new ArrayList();
		for(int i=0; i<n; i++) {
			if(a[i][0]) {
				ans.add("R " + (i+1));
				for(int j=0; j<n; j++) {
					a[i][j] = !a[i][j];
				}
			}
		}
		for(int j=0; j<n; j++) {
			if(a[0][j]) {
				ans.add("C " + (j+1));
				for(int i=0; i<n; i++) {
					a[i][j] = !a[i][j];
				}
			}
		}
		int count = 0;
		for(int i=0; i<n; i++)
			for(int j=0; j<n; j++)
				if(a[i][j]) count++;
		if(count > 0) System.out.println(-1);
		else {
			System.out.println(ans.size());
			for(String x : ans) System.out.println(x);
		}
	}
}