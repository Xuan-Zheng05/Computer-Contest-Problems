import java.io.*;
import java.util.*;

public class ConspicuousCrypticChecklist {
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int comAssign = 0;
      
      int numItems = sc.nextInt();
      int assignments = sc.nextInt();
      String[] items = new String[numItems];
      sc.nextLine();
   
      
      for (int i = 0; i < numItems; i++) {
         items[i] = sc.nextLine();
         
      }
          
      for (int k = 0; k < assignments; k++) {
         
         int haveItem = 0;
         int numRequiredItems = sc.nextInt();   
         String[] requiredItems = new String[numRequiredItems]; 
         
         sc.nextLine();
         for (int m = 0; m < numRequiredItems; m++) {
            requiredItems[m] = sc.nextLine();
            
         }  
         
         for (int j = 0; j < items.length; j++) 
            for (int n = 0; n < numRequiredItems; n++) {
               
               if (items[j].equals(requiredItems[n])) {
                  haveItem ++;
               }
            }
             
         if (haveItem == numRequiredItems) {
            comAssign ++;
         }         
      }
      
      System.out.println(comAssign);
       
   }
}