import java.util.*;
import java.io.*;

public class Sorting {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);   
      
      int nums = sc.nextInt();      
      int[] list = new int[nums];
      
      String answer = "NO";
      // for (int i = 0; i < nums; i++) {        
//          list[i] = sc.nextInt();
//       }   
      int zeroNum = -1;
      int check = 0;
      int last = -1;
      int n = -1;
      for (int j = 0; j < nums; j++) {
      
         list[j] = sc.nextInt();
         
         if(list[j] == 0) {
            if(zeroNum != -1) {
               if(zeroNum < n) {
                  System.out.println("NO");
                  return;
               
               }
            }
            
            else {
               last = n;
               n = 0;
               continue;
            }
         }
         
         else {
         
            if (n == 0) {
               n = list[j];
               zeroNum = n;
               
               if (n<last) {
                  System.out.println("NO");
                  return;
               
               }
            }
            
            else {
               
               if (list[j] < n) {
                  System.out.println("NO");
                  return;
               
               }
               
               else {
                  n = list[j];
               } 
                     
            }         
         }
      }
                 
      System.out.println("YES");
      
   }
}