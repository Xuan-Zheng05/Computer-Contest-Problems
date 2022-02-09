import java.io.*;
import java.util.*;

public class HomeRow {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String firstLine[] = sc.nextLine().split("");
      String secondLine[] = sc.nextLine().split("");
      
      int placeSame = -1;
      int strokes;
      
      for (int i = 0; i < firstLine.length; i++) {
         
         if (i >= secondLine.length) {
            break;
         }
         else {
            if (firstLine[i].equals(secondLine[i])) {
               placeSame = i;
               continue;
            }
            else {
               
               break;
            } 
         }           
      }
      
      strokes = firstLine.length - placeSame -1 ;
      strokes += secondLine.length - placeSame -1;
      
      System.out.println(strokes);
      
   }
}