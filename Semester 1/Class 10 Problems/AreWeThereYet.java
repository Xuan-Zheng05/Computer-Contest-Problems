import java.util.*;
import java.io.*;

public class AreWeThereYet {

   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;

   public static void main(String[] args) throws IOException {
      int[] cities = new int[5];
      int[] distance = new int[4];

      for (int i = 0; i < 4; i++) {
         distance[i] = readInt();
      }
      cities[0] = 0;
      for (int i = 1; i < 5; i++) {
         cities[i] = cities[i - 1] + distance[i - 1];
      }

      for (int i = 0; i < 5; i++) {
         for (int j = 0; j < 5; j++) {
            int output = cities[j] - cities[i];
            if (output < 0)
               output *= -1;
            System.out.print(output + " ");
         }
         System.out.println();
      }

   }

   static String next() throws IOException {
      while (st == null || !st.hasMoreTokens())
         st = new StringTokenizer(br.readLine().trim());
      return st.nextToken();
   }

   static long readLong() throws IOException {
      return Long.parseLong(next());
   }

   static int readInt() throws IOException {
      return Integer.parseInt(next());
   }

   static double readDouble() throws IOException {
      return Double.parseDouble(next());
   }

   static char readCharacter() throws IOException {
      return next().charAt(0);
   }

   static String readLine() throws IOException {
      return br.readLine().trim();
   }
}