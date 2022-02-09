import java.util.*;
import java.io.*;

public class Origami {  
   public static void main(String[] args) {
   
      Scanner sc = new Scanner(System.in);
      
      long numPaper = sc.nextLong();
      long numCuts = sc.nextLong();
      
      long ans = 0;
      long piece = 1;
      
      while (piece < numCuts && piece < numPaper) {
         piece += piece;
         ans++;
      }
      
      ans += (numPaper - piece + numCuts -1 ) / numCuts;
      System.out.println(ans);
      
   }
}