import java.util.*;
import java.io.*;

public class Lozinka {  
   public static void main(String[] args) {
      
      try {
      
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc= new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }
         
         char ch; 
         char mid = 'a';
         int wordLength = 0;
         
         int n = sc.nextInt();
         sc.nextLine();
         
         String[] passwords = new String[n];
         
         for (int i = 0; i < n; i++) {
            passwords[i] = sc.nextLine();
         }
         
         for (int k = 0; k < n; k++) {
            
            String revPass = "";
            
            for (int j = 0; j < passwords[k].length(); j++) {
               ch = passwords[k].charAt(j); 
               revPass = ch + revPass; 
            }
            
            for (int u = 0; u < n; u++) {
               if (revPass.equals(passwords[u])) {
                  wordLength = passwords[u].length();
                  mid = passwords[u].charAt((wordLength + 1) / 2 - 1);
               }
            }
         }
         
         System.out.println(wordLength + " " + mid);
         
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}