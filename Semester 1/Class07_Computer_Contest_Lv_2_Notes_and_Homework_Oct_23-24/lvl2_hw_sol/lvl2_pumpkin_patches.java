import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE;
		int minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE;
		for(int i=1; i<=n; i++) {
			int x = in.nextInt(), y = in.nextInt();
			minX = Math.min(minX, x);  maxX = Math.max(maxX, x);
			minY = Math.min(minY, y);  maxY = Math.max(maxY, y);
		}
		System.out.println(2*(maxX - minX) + 2*(maxY - minY));
	}
}