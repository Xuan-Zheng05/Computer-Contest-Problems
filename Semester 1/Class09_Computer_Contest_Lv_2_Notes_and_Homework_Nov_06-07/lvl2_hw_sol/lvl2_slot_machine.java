import java.util.*;
import java.io.*;
public class slot_machine {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), m1 = in.nextInt(), m2 = in.nextInt(), m3 = in.nextInt();
		int count = 0;
		while(true) {
			n--; m1++; count++;
			if(m1 == 35) {
				n += 30; m1 = 0;
			}
			if(n == 0) break;
			n--; m2++; count++;
			if(m2 == 100) {
				n += 60; m2 = 0;
			}
			if(n == 0) break;
			n--; m3++; count++;
			if(m3 == 10) {
				n += 9; m3 = 0;
			}
			if(n == 0) break;
		}
		System.out.println("Martha plays "+count+" times before going broke.");
	}
}