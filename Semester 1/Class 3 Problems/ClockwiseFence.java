import java.io.*;
import java.util.*;

public class ClockwiseFence {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      int fences = sc.nextInt();
      sc.nextLine();
      
      for (int i = 0; i < fences; i++) { 
      
         String fencePath[] = sc.nextLine().split("");
         int[] compareArray = new int[fencePath.length];
         
         for (int k = 0; k < fencePath.length; k++) {
         
            int convert = 1;;
            
            if (fencePath[k].equals("N")) {
               convert = 1;
            }
            if (fencePath[k].equals("E")) {
               convert = 2;
            }
            if (fencePath[k].equals("S")) {
               convert = 3;
            }
            if (fencePath[k].equals("W")) {
               convert = 4;
            }
            compareArray[k] = convert;
         }
         
         int compare = compareArray[0];
         int CW = 0, CCW = 0;
         for (int j = 1; j < compareArray.length; j++) {
         
            int difference = compareArray[j] - compare;
            compare = compareArray[j];
        
            if (difference == 1 || difference == -3) {
               CW += 1;
            }
            if (difference == -1 || difference == 3) {
               CCW += 1;
            }      
         
         }
         
         if (CW > CCW) {
            System.out.println("CW");
         }
         else {
            System.out.println("CCW");
         }
      }
      
   }
}