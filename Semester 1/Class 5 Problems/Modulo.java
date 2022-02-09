import java.util.*;
import java.io.*;

public class Modulo {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      int x = sc.nextInt();
      int y = sc.nextInt();
      int z = sc.nextInt();
      String answer = "NO";
      
      for (int i = 0; i < 50; i++) {
         int temp = x * (i+1);
         
         if (temp % y == z) {
            answer = "YES";
            break;
         }
      }
      
      System.out.println(answer);
   }
}