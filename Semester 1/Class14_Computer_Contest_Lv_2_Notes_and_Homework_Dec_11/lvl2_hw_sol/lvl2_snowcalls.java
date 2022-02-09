import java.util.*;
public class dmoj_email {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String key[] = {"", "", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};
		for(int i=0; i<n; i++) {
			String num = in.next().replaceAll("-", "").substring(0, 10), ans = "";
			for(int j=0; j<num.length(); j++) {
				char c = num.charAt(j);
				if(Character.isDigit(c)) {
					ans += c;
				} else {
					for(int k=2; k<=9; k++) {
						if(key[k].contains(""+c)) {
							ans += k;
						}
					}
				}
			}
			System.out.println(ans.substring(0, 3) + "-" + ans.substring(3, 6) + "-" + ans.substring(6));
		}
    }
}