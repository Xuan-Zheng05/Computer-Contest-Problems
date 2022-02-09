import java.util.*;
public class question4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String [] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		while(true){
			String msg = in.nextLine();  int sum = 0, prev = 0;
			if(msg.equals("halt")) break;
			for(int i=0; i<msg.length(); i++){
				String c = ""+msg.charAt(i);
				for(int k=2; k<=9; k++){
					if(key[k].contains(c)){
						int t = key[k].indexOf(c)+1;
						sum += t;
						if(k == prev) sum += 2; //add pause
						prev = k;
					}
				}
			}
			System.out.println(sum);
		}
	}
}