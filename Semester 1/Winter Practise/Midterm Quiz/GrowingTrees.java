import java.util.*;
import java.io.*;
   
public class GrowingTrees { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      int n = readInt();    
      int[][] trees = new int[n][2];
      
      for (int i = 0; i < n; i++) {
         trees[i][0] = readInt();
         trees[i][1] = readInt();
      }
      
      for (int k = 0; k < n; k++) { 
         for (int a = 0; a < n; a++) {
            if (trees[k][0] == trees[a][0] && k!=a) {
               System.out.println(0);
               System.exit(0);
            }
         }
      } 
      
      for (int i = 1; i < 100000; i++) {
         for (int j = 0; j < n; j++) {
            trees[j][0] += trees[j][1];
         }
         for (int k = 0; k < n; k++) { 
            for (int a = 0; a < n; a++) {
               if (trees[k][0] == trees[a][0] && k!=a) {
                  System.out.println(i);
                  System.exit(0);
               }
            }
         }
      }
      System.out.println(-1);
      
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