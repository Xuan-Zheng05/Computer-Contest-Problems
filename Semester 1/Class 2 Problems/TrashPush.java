import java.util.*;
import java.io.*;

public class TrashPush {  
   public static void main(String[] args) {
      
      int numberOfCases, wrappers, cans, cansFilled;
      List<Integer> list = new ArrayList<Integer>();
      Scanner sc = new Scanner(System.in);
      
      numberOfCases = sc.nextInt(); sc.nextLine();
   
      
      for (int i=0; i<numberOfCases; i++) {
         String[] s = sc.nextLine().split(" ");
         wrappers = Integer.parseInt(s[0]);
         cans = Integer.parseInt(s[1]);
      
         cansFilled = wrappers / cans;
      
         if ( wrappers % cans != 0) {
           cansFilled = cansFilled+1; 
         }
         System.out.println(cansFilled);
         //list.add(cansFilled);
      }
      
      //for (int k=0; k<numberOfCases; k++) {
         //System.out.println(list.get(k));
      //}
   }
}