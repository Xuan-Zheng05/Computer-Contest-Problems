import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int m = in.nextInt(), n = in.nextInt(), k = in.nextInt();
		int [] row = new int[m+1], col = new int[n+1];
		for(int i=1; i<=k; i++) {
			char op = in.next().charAt(0); int x = in.nextInt();
			if(op == 'R') row[x]++;
			else col[x]++;
		}
		int odd_row = 0, even_row = 0, odd_col = 0, even_col = 0;
		for(int i=1; i<=m; i++) {
			if(row[i] % 2 == 0) even_row++;
			else odd_row++;
		}
		for(int i=1; i<=n; i++) {
			if(col[i] % 2 == 0) even_col++;
			else odd_col++;
		}
		System.out.println(even_row * odd_col + odd_row * even_col);
	}
}