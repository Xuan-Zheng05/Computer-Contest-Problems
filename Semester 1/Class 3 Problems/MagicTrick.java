import java.io.*;
import java.util.*;

public class MagicTrick {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      for (int i = 0; i < 5; i++) {
         
         int cards = sc.nextInt();
         int[] cardList = new int[cards];
         
         ArrayList<Integer> cardStack = new ArrayList<Integer>(cards);
         for(int k = 0; k < cards; k++) {
         
            cardList[k] = sc.nextInt();
            cardStack.add(cards - k);
         }
         
         try {
         
            String output = "";
            
            for(int a = 0; a < cards; a++) {
            
               output += cardStack.get(cardList[a]) + " ";
               cardStack.remove(cardList[a]);
            }
            
            output = output.trim();
            System.out.println(output);
            
         }
         catch(Exception e) {         
            System.out.println("IMPOSSIBLE");
         }      
      }
      
   }
}