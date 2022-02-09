import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		for(int t=1; t<=5; t++) {
			int rem = in.nextInt(), n = rem + 1, sum = (1+n)*n/2;
			for(int i=1; i<=rem; i++) {
				sum -= in.nextInt();
			}
			System.out.println(sum);
		}
	}
}