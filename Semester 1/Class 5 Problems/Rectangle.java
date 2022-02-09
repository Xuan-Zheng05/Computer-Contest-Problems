import java.util.*;
import java.io.*;

public class Rectangle {  
   public static void main(String[] args) {
      
      try {
         //long startTime = System.currentTimeMillis();
           
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc = new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }   
         
         Set<String> locations = new HashSet<String>();
      
         int best = 0;
         
         int num = sc.nextInt();
         int[] x = new int[num];
         int[] y = new int[num]; 
                
         for (int i = 0; i < num; i++) { 
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
            locations.add(x[i] + " " + y[i]);
         }         
         
         for(int i=0; i<num; i++) {  
            for(int j=i+1; j<num; j++) { 
            
               if(locations.contains(x[i]+" "+y[j]) && locations.contains(x[j] + " " + y[i])) {
                  best = Math.max(best, Math.abs(x[i]-x[j]) * Math.abs(y[i]-y[j]));
               }             
            }
         }
        
         System.out.println(best);
         //long estimatedTime = System.currentTimeMillis() - startTime;
         //System.out.println(estimatedTime);
             
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}