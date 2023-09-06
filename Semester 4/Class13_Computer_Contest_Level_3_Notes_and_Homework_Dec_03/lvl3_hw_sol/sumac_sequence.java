import java.util.*;
public class ccc11j3 {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int t1=in.nextInt(), t2=in.nextInt(), t3=t1-t2, cnt=3;
		for(; t3 <= t2; ){
			t1 = t2; t2= t3; t3 = t1-t2; cnt++;
		}
		System.out.println(cnt);
	}
}
