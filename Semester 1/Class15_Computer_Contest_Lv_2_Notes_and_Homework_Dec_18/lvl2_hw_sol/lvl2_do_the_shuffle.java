import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		List<Character> list = new ArrayList();
		for(char i='A'; i<='E'; i++) {
			list.add(i);
		}
		while(true) {
			int b = in.nextInt(), n = in.nextInt();
			if(b == 4) {
				for(int i=0; i<list.size(); i++)
					System.out.print(list.get(i) + " ");
				break;
			}else if(b==1) {
				for(int i=1; i<=n; i++) {
					char c = list.get(0); 
					list.remove(0); list.add(c);
				}
			}else if(b==2) {
				for(int i=1; i<=n; i++) {
					char c = list.get(4);
					list.remove(4); list.add(0, c);
				}
			}else if(b==3) {
				if( n % 2 == 1) {
					char c = list.get(0); 
					list.remove(0); list.add(1, c);
				}
			}
		}
	}
}