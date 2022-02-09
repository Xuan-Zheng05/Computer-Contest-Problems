import java.util.*;
import java.io.*;
public class test2 {
	public static void main(String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		String dir = "", pre = "";
		while(true) {
			int n = in.nextInt(); 
			if(n == 99999) break;
			int a = n/10000, b = n/1000%10, c = n%1000;
			if((a+b)%2 != 0) dir = "left";
			else if(a + b == 0) dir = pre;
			else dir = "right";
			pre = dir;
			System.out.println(dir + " " + c);
		}
	}
}