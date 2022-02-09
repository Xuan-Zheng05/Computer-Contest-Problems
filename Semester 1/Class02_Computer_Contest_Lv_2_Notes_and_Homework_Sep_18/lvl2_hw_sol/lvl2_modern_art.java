import java.util.*;
public class test2 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt(), k = in.nextInt();
		int [] row = new int[m+1], col = new int[n+1];
		for(int i=1; i<=k; i++) {
			char op = in.next().charAt(0); int x = in.nextInt();
			if(op == 'R') row[x]++;
			else col[x]++;
		}
		int evenr = 0, oddr = 0, evenc = 0, oddc = 0;
		for(int i=1; i<=m; i++) {
			if(row[i] % 2 == 0) evenr ++;
			else oddr++;
		}
		for(int i=1; i<=n; i++) {
			if(col[i] % 2 == 0) evenc++;
			else oddc++;
		}
		System.out.println(evenr * oddc + oddr * evenc);
	}
}