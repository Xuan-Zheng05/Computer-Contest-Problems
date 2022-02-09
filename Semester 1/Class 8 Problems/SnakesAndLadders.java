import java.util.*;
import java.io.*;
   
public class SnakesAndLadders { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      int input, position = 1;
      
      do {
         input = readInt();
         if (input == 0) {
            System.out.println("You Quit!");
            System.exit(0);
         }
         if (position + input > 100) {
            System.out.println("You are now on square " + position);
            continue;      
         }
         else {
            position += input;
         }
         
         if (position == 9) position = 34;
         if (position == 40) position = 64;
         if (position == 67) position = 86;
         
         if (position == 54) position = 19;
         if (position == 90) position = 48;
         if (position == 99) position = 77;
         
         System.out.println("You are now on square " + position);
         
         if (position == 100) {
            System.out.println("You Win!");
            System.exit(0);
         }
         
      } while (input != 0);
      
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