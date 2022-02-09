import java.util.*;
import java.io.*;
   
public class BigBangSecrets { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      int k = readInt();
      
      String[] word = readLine().split("");
      String[] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M",
         "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
      
      for (int i = 0; i < word.length; i++) {
         int wordPosition = 0;
         
         for (int j = 0; j < alphabet.length; j++) {
            if (word[i].equals(alphabet[j])) {
               wordPosition = j;
               int shift = 3 * (i+1) + k;
               if (wordPosition - shift < 0) {
                  wordPosition = 26 + wordPosition - shift;
                  break;
               }
               else {
                  wordPosition = wordPosition - shift;
                  break;
               }
            }
         }
         System.out.print(alphabet[wordPosition]);
      } 
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