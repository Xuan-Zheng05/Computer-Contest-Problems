import java.util.*;
import java.io.*;

public class Gates {  
   public static void main(String[] args) {
      
      try {
      
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc= new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }   
         
         int gatePlane = 0;
         
         int numGates = sc.nextInt();
         int numPlanes = sc.nextInt();
      
         boolean [] gates = new boolean[numGates];   
        

         for (int i = 0; i < numPlanes; i++) {         
            int count = 0;
            
            int planeNum = sc.nextInt();
            boolean findGate = false;
            for (int j = planeNum-1; j >= 0; j--) {
               if (!gates[j]) {
                  gates[j] = true;
                  gatePlane ++;
                  findGate = true;
                  break;
               }
               
            }
            if (findGate == false) {
               System.out.println(gatePlane);
               return;
            }         
         }
         System.out.println(gatePlane);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}