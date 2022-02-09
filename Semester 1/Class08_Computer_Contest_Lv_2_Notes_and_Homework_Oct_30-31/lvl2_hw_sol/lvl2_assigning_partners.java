import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(); Map<String, String> map = new HashMap();
		String a[] = new String[n], b[] = new String[n];
		for(int i=0; i<n; i++) {
			a[i] = in.next();
		}
		for(int i=0; i<n; i++) {
			b[i] = in.next();
			map.put(a[i], b[i]);
		}
		for(int i=0; i<n; i++) {
			if(a[i].equals(b[i]) || !map.get(b[i]).equals(a[i])) {
				System.out.println("bad"); return;
			}
		}
		System.out.println("good");
	}
}