import java.util.*;
import java.io.*;

public class Triangles {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int numPosts = sc.nextInt();
      
      int[] x = new int[numPosts];
      int[] y = new int[numPosts];
      
      for(int i = 0; i < numPosts; i++) {     
         x[i] = sc.nextInt();
         y[i] = sc.nextInt();
      }
      
      int maxArea = 0;
      for(int i = 0; i < numPosts; i++) {
         for(int j = 0; j < numPosts; j++) { 
         
            if(i == j || x[i] != x[j]) 
               continue;
               
            for(int k = 0; k < numPosts; k++) { 
            
               if(i == k || y[i] != y[k]) 
                  continue;
                  
               maxArea = Math.max(maxArea, Math.abs(x[k] - x[i]) * Math.abs(y[j] - y[i]));
            }
         }
      }
      System.out.println(maxArea);
   }
}