import java.util.*;
public class homework {
	public static void main (String [] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), box[][] = new int[n][3];
		for(int i=0; i<n; i++) {
			for(int j=0; j<3; j++)
				box[i][j] = in.nextInt();
			Arrays.sort(box[i]);
		}
		int m = in.nextInt(), item[] = new int[3];
		for(int k=0; k<m; k++) {
			for(int j=0; j<3; j++)
				item[j] = in.nextInt();
			Arrays.sort(item);
			long vol = Long.MAX_VALUE;
			for(int i=0; i<n; i++) {
				if(box[i][0] >= item[0] && box[i][1] >= item[1] && box[i][2] >= item[2])
					vol = Math.min(vol, (long)box[i][0] * box[i][1] * box[i][2]);
			}
			if(vol == Long.MAX_VALUE) System.out.println("Item does not fit.");
			else System.out.println(vol);
		}
	}
}