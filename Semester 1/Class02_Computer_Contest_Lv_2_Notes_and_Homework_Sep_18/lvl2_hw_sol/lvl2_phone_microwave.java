import java.util.*;
public class test2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();  in.nextLine();
		String str[] = in.nextLine().split("[/: ]");
		int year = Integer.parseInt(str[0]), mon = Integer.parseInt(str[1]), day = Integer.parseInt(str[2]);
		int hour = Integer.parseInt(str[3]), min = Integer.parseInt(str[4]), sec = Integer.parseInt(str[5]);
		int num[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		hour -= s;
		while(hour < 0) {
			hour += 24; day --;
			while(day == 0) {
				mon --;
				if(mon == 0) {
					year--; mon += 12;
				}
				day += num[mon];
			}
		}
		System.out.println(String.format("%d/%02d/%02d %02d:%02d:%02d", year, mon, day, hour, min, sec));
	}
}