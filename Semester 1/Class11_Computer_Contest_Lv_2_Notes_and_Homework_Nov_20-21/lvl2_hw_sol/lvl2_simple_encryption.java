import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String key = in.nextLine(), msg = in.nextLine(), ans = "";
		for(int i=0, idx=0; i<msg.length(); i++) {
			char c = msg.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				int p = idx % key.length();
				c = (char)(c + key.charAt(p) - 'A');
				if(c > 'Z') c -= 26;
				ans += c; 
				idx++;
			}
		}
		System.out.println(ans);
	}
}