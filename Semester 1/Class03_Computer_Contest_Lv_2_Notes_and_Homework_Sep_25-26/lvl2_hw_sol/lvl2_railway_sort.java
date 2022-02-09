import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		for(int t=1; t<=10; t++) {
			int n = in.nextInt(); List<Integer> car = new ArrayList();
			for(int i=0; i<n; i++) {
				car.add(in.nextInt());
			}
			int cost = 0;
			for(int i=n-1; i>=1; i--) {
				int cur = car.indexOf(i), nxt = car.indexOf(i+1);
				if(cur > nxt) {
					cost += cur;
					car.remove(cur);
					car.add(0, i);
				}
			}
			System.out.println(cost);
		}
	}
}