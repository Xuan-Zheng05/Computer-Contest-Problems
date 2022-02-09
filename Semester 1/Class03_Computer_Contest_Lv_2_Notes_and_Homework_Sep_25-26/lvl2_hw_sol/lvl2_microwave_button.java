import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		String str[] = in.nextLine().split(":");
		int hh = Integer.parseInt(str[0]), mm = Integer.parseInt(str[1]), ss = Integer.parseInt(str[2]);
		int desire = hh*3600 + mm*60 + ss, minDif = Integer.MAX_VALUE, bestH = 0, bestM = 0, bestS = 0;
		String button = in.nextLine(); 
		boolean [] work = new boolean[10];
		for(int i=0; i < button.length(); i++) {
			work[button.charAt(i) - '0'] = true;
		}
		for(int h=0; h<=99; h++) {
			if(!work[h/10] || !work[h%10]) continue;
			for(int m=0; m<=99; m++) {
				if(!work[m/10] || !work[m%10]) continue;
				for(int s=0; s<=99; s++) {
					if(!work[s/10] || !work[s%10]) continue;
					int time = h*3600 + m*60 + s;
					if(Math.abs(desire - time) < minDif) {
						minDif = Math.abs(desire - time);
						bestH = h; bestM = m; bestS = s;
					}
				}
			}
		}
		System.out.printf("%02d:%02d:%02d", bestH, bestM, bestS);
	}
}