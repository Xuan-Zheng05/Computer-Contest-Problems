import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int J = in.nextInt(), N = in.nextInt();
		int size[] = new int[J+1];
		for(int i=1; i<=J; i++) {
			String s = in.next();
			size[i] = getSize(s);
		}
		int ans = 0;
		for(int i=1; i<=N; i++) {
			String s = in.next(); 
			int prefer = getSize(s), num = in.nextInt();
			if(size[num] >= prefer) {
				ans++; size[num] = 0;
			}
		}
		System.out.println(ans);
	}
	static int getSize(String s) {
		//small:1  medium:2  large:3
		if(s.equals("S")) return 1;
		else if(s.equals("M")) return 2;
		else return 3;
	}
}