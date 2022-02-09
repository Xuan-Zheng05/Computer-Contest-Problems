import java.util.*;
import java.io.*;

public class SecretInstructions {  
   public static void main(String[] args) {
   
      String input = "";
      String direction = "";
      int sum;
      Scanner sc = new Scanner(System.in);
      
      while (input != "99999") {
         input = sc.nextLine();
         if (input.equals("99999")) {
            break;
         }
         
         sum = (input.charAt(0) - '0') + (input.charAt(1) - '0');
      
         if (sum % 2 == 0 && sum != 0) {
            direction = "right";
         }
         else if (sum % 2 == 1) {
            direction = "left";
         }
         
         System.out.print(direction + " ");
         System.out.println(input.substring(2));
                 
      }
      
   }
}
