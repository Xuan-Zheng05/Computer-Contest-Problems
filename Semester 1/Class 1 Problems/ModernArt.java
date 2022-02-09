import java.util.*;
import java.io.*;

public class ModernArt {  
   public static void main(String[] args) {
      
      int rows, columns, choices, rowOrColumn;
      int goldNumber = 0;
      String choice;
      Scanner sc = new Scanner(System.in);
      
      rows = sc.nextInt();
      columns = sc.nextInt();
      choices = sc.nextInt();
      
      boolean[][] painting = new boolean[rows][columns];
   
      // for (int i = 0; i < rows; i++) {
//          for (int k = 0; k < columns; k++) {
//             painting[i][k] = 1;
//          }
//       }
      
      choice = sc.nextLine();
      
      for (int j = 0; j < choices; j++) {
         
         choice = sc.nextLine();
         
         rowOrColumn = choice.charAt(2) - '0';

         if (choice.substring(0, 1).equals("R")) {
             painting[rowOrColumn - 1] = ! painting[rowOrColumn - 1];
          }else{
           painting[s][rowOrColumn - 1] = !painting[s][rowOrColumn - 1];

            
                     }        
      }
      
      for (int d = 0; d < rows; d++) {
         for (int f = 0; f < columns; f++) {
        
            if (painting[d][f]) {
               goldNumber++;
             }
         }
      }
      
      System.out.println(goldNumber);
   }
}
      

      // for (int i = 0; i < rows; i++) {
//          for (int k = 0; k < columns; k++) {
//             painting[i][k] = 1;
//          }
//       }
//       
//       choice = sc.nextLine();
//       
//       for (int j = 0; j < choices; j++) {
//          
//          choice = sc.nextLine();
//          
//          rowOrColumn = choice.charAt(2) - '0';
// 
//          if (choice.substring(0, 1).equals("R")) {
//             for (int a = 0; a < columns; a++) {
//                painting[rowOrColumn - 1][a] ^=1;
//             }
//          }
//          if (choice.substring(0, 1).equals("C")) {
//             for (int s = 0; s < rows; s++) {
//                painting[s][rowOrColumn - 1]^= 1;
//             }
//          }        
//       }
//       
//       for (int d = 0; d < rows; d++) {
//          for (int f = 0; f < columns; f++) {
//             if (painting[d][f]  == 0) {
//                goldNumber++;
//             }
//          }
//       }
//       
//       System.out.println(goldNumber);
// 