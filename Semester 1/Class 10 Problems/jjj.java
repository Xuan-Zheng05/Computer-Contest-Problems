import java.util.*;
import java.io.*;
   
public class jjj { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      int[] cities = new int[5];
      cities[0] = 0;
      for (int i = 1; i < 5; i++) {
         cities[i] = readInt();      
      }
      for (int i = 0; i < 5; i++) {
         for (int j = 0; i < 5; j++) {
            System.out.print(Math.abs(cities[i] - cities[j]) + " ");
         }
         System.out.println();
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