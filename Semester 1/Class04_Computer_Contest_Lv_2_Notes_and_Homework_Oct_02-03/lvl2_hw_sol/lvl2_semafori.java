import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), len = in.nextInt();
		int time = 0,  cur = 0;
		for(int i=1; i<=n; i++) {
			int pos = in.nextInt(), red = in.nextInt(), green = in.nextInt();
			time += pos - cur;
			int rem = time % (red + green);
			if(rem < red) {
				time += red - rem;
			}
			cur = pos;
		}
		time += len - cur;
		System.out.println(time);
	}
}