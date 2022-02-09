import java.util.*;
public class test2{
	public static void main(String [] args){
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt(), max = 0;
	    Map<String, Integer> map = new HashMap();
	    for(int i=0; i<n; i++) {
	    	String color = in.next();
	    	map.put(color, map.getOrDefault(color, 0) + 1);
	    	max = Math.max(max, map.get(color));
	    }
	    int rest = n - max;
	    if(max > rest + 1) System.out.println(2*rest + 1);
	    else System.out.println(n);
	}
}