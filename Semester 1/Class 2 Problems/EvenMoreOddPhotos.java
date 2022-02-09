import java.util.*;
import java.io.*;

public class EvenMoreOddPhotos {  
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);    
      int numCows = sc.nextInt();
      int even = 0;
      int odd = 0;
      
      for (int i=0; i<numCows; i++) {
         int Id = sc.nextInt();
         
         if (Id % 2==0) {
            even++;
         }
         else {
            odd++;
         }
      }
      
      while (odd > even) {
         odd = odd - 2;
         even++;
      }
      if (even > odd+1)  {
         even = odd+1;
      }
      
      System.out.println(even+odd);
   }
}