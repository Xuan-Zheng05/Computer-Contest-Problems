import java.util.*;
import java.io.*;
   
public class xytest { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      HashSet<String> set = new HashSet<>();
     
      int h = readInt(), v = readInt();
      String[] x = new String[v];
      String[] y = new String[h];
      
      for (int i = 0; i < h; i++) {
         y[i] = readLine();
      }
      for (int i = 0; i < v; i++) {
         x[i] = readLine();
         for (int j = 0; j < h; j++) {
            set.add(x[i] + " " + y[j]);
         }
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