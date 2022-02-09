import java.util.*;
import java.io.*;

public class JamesRectangle {  
   public static void main(String[] args) {
      
      try {
           
         Scanner sc;
         boolean fromFile = false;
         
         if (fromFile) {
            sc = new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }   
         
         Set<String> locations = new HashSet<String>();
         List<Set>rectanges = new ArrayList();
      
         int rectangles = 0;
         
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
                  boolean found = false;
                  for (Set s : rectanges){
                     if (s.contains(x[i]+" "+y[i]) &&s.contains(x[i]+" "+y[j]) &&s.contains(x[j]+" "+y[i])&&s.contains(x[j]+" "+y[j]))
                        found = true;
                     break;
                  }
                  if(found){
                     continue;
                  }else{
                     Set<String> r = new HashSet<String>();
                     r.add(x[i]+" "+y[i]);
                     r.add(x[i]+" "+y[j]);
                     r.add(x[j]+" "+y[i]);
                     r.add(x[j]+" "+y[j]);
                     if(r.size() == 4){
                        rectanges.add(r);
                        rectangles ++;
                     
                     }                 
                  }
               }                                            
            }
         }
        
         System.out.println(rectangles);
             
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}