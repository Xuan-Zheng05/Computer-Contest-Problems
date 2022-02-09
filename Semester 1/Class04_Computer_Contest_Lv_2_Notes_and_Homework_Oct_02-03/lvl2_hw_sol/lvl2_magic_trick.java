import java.util.*;
public class test2 {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		for(int t=1; t<=5; t++) {
			int n = in.nextInt();
			List<Integer> card = new ArrayList(), res = new ArrayList();
			for(int i=n; i>=1; i--) {
				card.add(i);
			}
			boolean possible = true;
			for(int i=1; i<=n; i++) {
				int m = in.nextInt();
				if(card.size() <= m) {
					possible = false;
					break;
				}else {
					res.add(card.get(m));
					card.remove(m);
				}
			}
			if(possible) {
				for(int x : res) System.out.print(x + " ");
				System.out.println();
			}else {
				System.out.println("IMPOSSIBLE");
			}
		}
	}
}