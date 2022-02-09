import java.util.*;
import java.io.*;
   
public class BobsHistogram { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      int n = readInt();
      int[] array = new int[n];
      for (int i = 0; i < n; i++) {
         array[i] = readInt();
      }
      
      int y = 0;
      int least = Integer.MAX_VALUE;
      for (int i = -1000; i < 1000; i++) {
         int temp = 0;
         for (int j = 0; j < n; j++) {
            temp += Math.pow(array[j] - i, 2);
         }
         if (temp < least) {
            y = i;
            least = temp;
         }
      }
      System.out.println(least);
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