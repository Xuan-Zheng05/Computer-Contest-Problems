import java.io.*;
import java.util.*;
public class homework {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int h = in.nextInt(), w = in.nextInt(), a[][] = new int[h][w];
    	for(int i=0; i<h; i++)
    		for(int j=0; j<w; j++)
    			a[i][j] = in.nextInt();
    	for(int j=w-1; j>=0; j--){
    		for(int i=0; i<h; i++)
    			System.out.print(a[i][j]+" ");
    		System.out.println();
    	}
    }
}