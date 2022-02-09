import java.util.*;
import java.io.*;

public class SilentAuction {  
   public static void main(String[] args) {
      
      int participants, bid;
      int max = 0;
      String winner = "";
      Scanner sc = new Scanner(System.in);
      
      participants = sc.nextInt();
      
      int[] bids = new int[participants];
      String[] names = new String[participants];
      
      for (int i = 0; i < participants; i++) {
         sc.nextLine();
         names[i] = sc.nextLine();
         bid = sc.nextInt();
         bids[i] = bid;
      }
      for (int j = 0; j < bids.length; j++) {
         if (bids[j] > max) {
            winner = names[j];
            max = bids[j];
         }
      }
      
      System.out.println(winner);
      
   }
}