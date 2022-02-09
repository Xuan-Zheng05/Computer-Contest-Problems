import java.util.*;
import java.io.*;
   
public class Rövarspråke { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException { 
      String[] closestVowel = {"a", "a", "e", "e", "e", "i","i","i","i","o","o","o","o",
         "o","u","u","u","u","u","u","u",};
      String[] consonant = {"b", "c", "d", "f", "g","h","j","k","l","m","n","p",
         "q","r","s","t","v","w","x","y", "z"}; 
      String[] nextConsonant = {"c", "d", "f", "g","h","j","k","l","m","n","p",
         "q","r","s","t","v","w","x","y", "z", "z"}; 
         
      boolean run = true;
      String temp = readLine();
      String[] word = temp.split("");
   
      String newWord = "";
      for (int i = 0; i < word.length; i++) {
         for (int j = 0; j < consonant.length; j++) {
            run = true;
            if (consonant[j].equals(word[i])) {
               newWord = newWord + word[i] + closestVowel [j] + nextConsonant[j];
               run = false;
               break;
            }
         }
         if (run == true) {
            newWord = newWord + word[i];
         }
      }
      System.out.println(newWord);
   }
   
   static String next () throws IOException {
      while (st == null || !st.hasMoreTokens())
         st = new StringTokenizer(br.readLine().trim());
      return st.nextToken();
   }
   static long readLong () throws IOException {
      return Long.parseLong(next());
   }
   static int readInt () throws IOException {
      return Integer.parseInt(next());
   }
   static double readDouble () throws IOException {
      return Double.parseDouble(next());
   }
   static char readCharacter () throws IOException {
      return next().charAt(0);
   }
   static String readLine () throws IOException {
      return br.readLine().trim();
   }
}