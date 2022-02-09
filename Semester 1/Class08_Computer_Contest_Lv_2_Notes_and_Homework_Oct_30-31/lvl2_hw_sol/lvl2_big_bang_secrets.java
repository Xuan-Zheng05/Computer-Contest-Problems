import java.util.*;
public class ccc12j4 {
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		char [] ch = in.next().toCharArray();
		for(int p=0; p<ch.length; p++){
			int t = ((ch[p]-'A') - 3*(p+1) - K)%26;
			if(t < 0) t += 26;
			System.out.print((char)('A'+t));
		}
	}
}