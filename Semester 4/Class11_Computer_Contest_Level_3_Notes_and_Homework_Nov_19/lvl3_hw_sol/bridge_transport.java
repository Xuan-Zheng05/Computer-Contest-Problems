import java.util.*;
public class question3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int w = in.nextInt(), n = in.nextInt(), a[] = new int[n];
		for(int i=0; i<n; i++){
			a[i] = in.nextInt();
		}
		int sum = 0;
		for(int i=0; i<4; i++){
			sum += a[i];
			if(sum > w) { System.out.println(i); return; }
		}
		for(int i=4; i<n; i++){
			sum += a[i] - a[i-4];
			if(sum > w){ System.out.println(i); return; }
		}
		System.out.println(n);
	}
}