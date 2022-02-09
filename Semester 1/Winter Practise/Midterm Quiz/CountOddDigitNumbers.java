import java.util.*;
import java.io.*;
   
public class CountOddDigitNumbers { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      long n = readLong();  
      long oddNums = 0;
      long length = Long.toString(n).length();
      
      if (length % 2 == 1){
         oddNums += n - (long)Math.pow(10L, length-1) + 1;
         length -= 1;
      }
      for (long i = 1; i < length; i+=2){
         oddNums += 9*(long)Math.pow(10, i-1);
      }
      System.out.println(oddNums);   
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