import java.util.*;
public class homework{
	public static void main(String [] args){ 
		Scanner in = new Scanner(System.in);
		int d[] = new int[5];
		for(int i=1; i<=4; i++) d[i] = in.nextInt();
		for(int i=0; i<5; i++){
			int a[] = new int[5];
			for(int j=i+1; j<5; j++)
				a[j] = a[j-1] + d[j];
			for(int j=i-1; j>=0; j--)
				a[j] = a[j+1] + d[j+1];
			for(int j=0; j<5; j++)
				System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}