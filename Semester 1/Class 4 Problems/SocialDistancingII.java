import java.util.*;
import java.io.*;

public class SocialDistancingII {  
   public static void main(String[] args) {
   
      try {
      
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc= new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }
               
         int r = 1000000000;   
         int numCows = sc.nextInt();
      
         List<List> rows = new ArrayList();
         for (int i = 0; i < numCows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            int a = sc.nextInt();
            int b = sc.nextInt();
            temp.add(a);
            temp.add(b);
            rows.add(temp);
         
         }
      
         Collections.sort(rows, 
            new Comparator<List>() 
            {
               @Override
               public int compare(List a, List b) {
                  Integer a1 = (int)a.get(0);
                  Integer b1 = (int)b.get(0);
                  if(a1> b1) 
                     return 1;
                  if (a1<b1)
                     return -1;
                  return 0;
               
               }
            });
         int min = 1000000;
         List t1 = rows.get(0);
         int f = (int)t1.get(1);
         int s = (int)t1.get(0);
         for (int i = 1; i < numCows; i++) {
            List t11 = rows.get(i);
            int f1 = (int)t11.get(1);
            int s1 = (int)t11.get(0);
            if(f1!=f){
               int m = s1- s;
               if(m<min) min = m;
               f = f1;
            }
            s = s1;
         }
         min = min-1;
         int firstF = 0;
         int f_position = -1;
         int currentF = -100000;
         for (int i = 0; i < numCows; i++) {
            List t11 = rows.get(i);
            int f1 = (int)t11.get(1);
            int s1 = (int)t11.get(0);
            if(f_position == -1){
                if(f1 == 1 ){
                   f_position = s1;
                 
                }
                continue;

            }
            if(((s1 - currentF) <=min) && firstF != 0){
               continue;
            }
            
            if(s1 - f_position > min){
                     firstF += 1;
                     if(f1 ==1)
                        f_position = s1;
                     else
                       f_position = -1;
 

            }else{
               if(f1 ==1)
                  currentF = s1;

            }   
            
                                                            
                     
          
         }
         if(f_position != -1)
            firstF += 1;
                
         System.out.println(firstF);
           
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
}