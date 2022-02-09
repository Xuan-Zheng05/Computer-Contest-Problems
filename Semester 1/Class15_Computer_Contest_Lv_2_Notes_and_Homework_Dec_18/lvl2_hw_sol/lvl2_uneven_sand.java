import java.util.*;
public class test2 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		int left = 1, right = (int)2e9, cnt=1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			System.out.println(mid);
			String s = in.next();
			if(s.equals("SINKS")) left = mid + 1;
			else if(s.equals("FLOATS")) right = mid - 1;
			else break;
		}
	}
}