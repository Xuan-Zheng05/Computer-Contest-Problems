import java.util.*;
import java.io.*;

public class PartialGame {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      long even = 0;
      long odd = 0;
      
      int numPiles = sc.nextInt();
      
      sc.nextLine();  
      String piles[]= sc.nextLine().split(" ");
   
      int intPiles[] = new int[piles.length];
      for (int i = 0; i<piles.length; i++) {
         intPiles[i]= Integer.parseInt(piles[i]);
         
         if (intPiles[i] % 2 == 0) {
            even = even+intPiles[i]/2;
         }
         else {
            odd = odd+(intPiles[i] + 1) / 2 ;
         }
      }
      
      if (even>odd) {
         System.out.println("Duke");
      }
      else if (odd>even) {
         System.out.println("Alice");
      }
      else {
         System.out.println("Alice");
      }
      
   }
}