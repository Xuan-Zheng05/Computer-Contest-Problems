import java.io.*;
import java.util.*;

public class Jerseys {
//m s l
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      String prefSize;
      int prefNum, reqSat = 0;

      int jerseys = sc.nextInt();
      int athletes = sc.nextInt();
      String[] sizes = new String[jerseys];
      
      sc.nextLine();
      for (int i = 0; i < jerseys; i++) {
         sizes[i] = sc.nextLine();
      }
      
      for (int k = 0; k < athletes; k++) 
      {
         String preference[] = sc.nextLine().split(" ");
         
         prefSize = Integer.parseIntpreference[0];
         prefNum = Integer.parseInt(preference[1]);
         
         if (prefSizesizes[prefNum - 1]
         
         for (int j = 0; j < jerseys; j++)          
            if (prefSize.equals(s  )) {
               reqSat = reqSat + 1;
               sizes[j] = "Used";
            }        
      }
      
      System.out.println(reqSat);
   }
}