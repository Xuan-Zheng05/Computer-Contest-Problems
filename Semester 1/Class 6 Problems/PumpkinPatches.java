import java.util.*;
import java.io.*;

public class PumpkinPatches {  
   public static void main(String[] args) {
      
      try {
           
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc = new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }   
      
         int x, y;
         int maxX = -Integer.MAX_VALUE, maxY = -Integer.MAX_VALUE,
            minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
         
         int num = sc.nextInt();
                
         for (int i = 0; i < num; i++) { 
            x = sc.nextInt();
            y = sc.nextInt();
            
            if (x > maxX) {
               maxX = x; 
            }
            else if (x < minX) {
               minX = x;
            }
            
            if (y > maxY) {
               maxY = y;
            }
            else if (y < minY) {
               minY = y;
            }
         }         
         System.out.println( (maxX - minX + maxY - minY) * 2 );
             
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}