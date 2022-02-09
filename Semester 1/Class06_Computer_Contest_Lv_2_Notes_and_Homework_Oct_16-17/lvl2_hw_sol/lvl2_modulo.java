import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt(), y = in.nextInt(), z = in.nextInt();
		for(int k=1; k<=y; k++) {
			if(k*x % y == z) {
				System.out.println("YES"); return;
			}
		}
		System.out.println("NO");
	}
}