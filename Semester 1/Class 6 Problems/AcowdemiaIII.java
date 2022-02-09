import java.util.*;
import java.io.*;
   
public class AcowdemiaIII { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      int n = readInt();
      int m = readInt();
      
      char[][] pasture = new char[n+2][];
      pasture[0] = new char[m + 2];
      Arrays.fill(pasture[0], '.');
      pasture[n + 1] = pasture[0];
      
      for (int y = 1; y <= n; y++) {
         pasture[y] = ('.' + readLine() + '.').toCharArray();
      }
      int answer = 0;
      for (int y = 1; y <= n; y++) {
         for (int x = 1; x <= m; x++) {
            if (pasture[y][x] == 'G' && ((pasture[y][x - 1] == 'C' && pasture[y][x + 1] == 'C') || (pasture[y - 1][x] == 'C' && pasture[y + 1][x] == 'C'))) {
               pasture[y][x] = '.';
               answer++;
            }
         }
      }
      
      for (int y = 1; y <= n; y++) {
         for (int x = 1; x <= m; x++) {
            if (pasture[y][x] == 'C') {
               if (pasture[y + 1][x - 1] == 'C') {
                  if (pasture[y][x - 1] == 'G') {
                     pasture[y][x - 1] = '.';
                     answer++;
                  } else if (pasture[y + 1][x] == 'G') {
                     pasture[y + 1][x] = '.';
                     answer++;
                  }
               }
               if (pasture[y + 1][x + 1] == 'C') {
                  if (pasture[y][x + 1] == 'G') {
                     pasture[y][x + 1] = '.';
                     answer++;
                  } else if (pasture[y + 1][x] == 'G') {
                     pasture[y + 1][x] = '.';
                     answer++;
                  }
               }
            }
         }
      }
      System.out.println(answer);     
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