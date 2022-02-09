import java.util.*;
public class ccc15j3{
	public static void main(String [] args){
		Scanner in = new Scanner(System.in);
		String s = in.next();
		char [] vowel = {'a', 'e', 'i', 'o', 'u'};
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
				System.out.print(ch);
			}else{
				System.out.print(ch);
				int MIN=30, idx=-1;
				for(int j=0; j<vowel.length; j++){
					if(Math.abs(vowel[j] - ch) < MIN){
						MIN=Math.abs(vowel[j] - ch); idx = j;
					}
				}
				System.out.print(vowel[idx]);
				if(ch=='z') System.out.print(ch);
				else if(ch=='d' || ch=='h' || ch=='n' || ch=='t')
					System.out.print((char)(ch+2));
				else System.out.print((char)(ch+1));
			}
		}
	}
}