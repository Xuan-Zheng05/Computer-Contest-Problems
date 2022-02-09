import java.util.*;
import java.io.*;

public class MadScientist {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int times = 0;
      
      int characters = sc.nextInt();
      sc.nextLine();
      
      char[] a = sc.nextLine().toCharArray();
      char[] b = sc.nextLine().toCharArray();
      
      while(!new String(a).equals(new String(b))) {
        
         times++;        
         int leftSide = 0;
         
         while(a[leftSide] == b[leftSide]) {
            leftSide++;
         }
         
         int rightSide = characters - 1;  
               
         while(a[rightSide] == b[rightSide]) {
            rightSide--;
         }
         
         for (int i = leftSide; i <= rightSide; i++) {
         
            if(a[i] == 'G') {
               a[i] = 'H';
            }
            
            else {
               a[i] = 'G';
            }         
         }
      }
      
      System.out.println(times);
      sc.close();
   }
}