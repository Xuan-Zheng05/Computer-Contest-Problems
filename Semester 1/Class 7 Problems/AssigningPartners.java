import java.util.*;
import java.io.*;

public class AssigningPartners {

   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;

   public static void main(String[] args) throws IOException {

      int n = readInt();
      Set tempSet1 = new HashSet();
      Set tempSet2 = new HashSet();

      String[] line1 = readLine().split(" ");
      String[] line2 = readLine().split(" ");

      for (int i = 0; i < n; i++) {
         if (!tempSet1.add(line1[i])) {
            System.out.println("bad");
            System.exit(0);
         }
      }
      for (int i = 0; i < n; i++) {
         if (!tempSet2.add(line2[i])) {
            System.out.println("bad");
            System.exit(0);
         }
      }
      for (int i = 0; i < n; i++) {
         if (line1[i].equals(line2[i])) {
            System.out.println("bad");
            System.exit(0);
         }
      }
      System.out.println("good");
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