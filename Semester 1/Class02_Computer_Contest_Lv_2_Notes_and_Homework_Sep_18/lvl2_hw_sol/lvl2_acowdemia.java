import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();
		Integer a[] = new Integer[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		Arrays.sort(a, Comparator.reverseOrder());
		int h = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] >= h+1)  h++;  
			else break;
		}
		for(int i=h; i>=Math.max(0, h-k+1); i--) {
			a[i]++;
		}
		Arrays.sort(a, Comparator.reverseOrder());
		h = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] >= h+1)  h++;  
			else break;
		}		
		System.out.println(h);
	}
}