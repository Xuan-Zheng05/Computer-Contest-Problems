import java.util.Arrays;
import java.util.Scanner;

public class ccc13j4 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int time = s.nextInt();
		int cnum = s.nextInt();
		int[] ctimes = new int[100];
		for (int i = 0; i < cnum; i++)
			ctimes[i] = s.nextInt();
		Arrays.sort(ctimes, 0, cnum);
		int counter = 0;
		for (int i = 0; i < cnum && time >= 0; i++) {
			time -= ctimes[i];
			if (time < 0) break;
			else counter++;
		}
		System.out.println(counter);
		s.close();
	}
	
}
