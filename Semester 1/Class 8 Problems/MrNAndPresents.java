import java.util.*;
import java.io.*;

public class MrNAndPresents {

   static BufferedReader br = getBufferedReader(true);
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;

   public static void main(String[] args) throws IOException {
      ArrayList<String> list = new ArrayList<String>();

      int q = readInt();
      String t = "";

      for (int i = 0; i < q; i++) {
         String[] input = readLine().split(" ");
         if (input[0].equals("F")) {
            t = input[1] + "," + t;
         } else if (input[0].equals("E")) {
            t = t + input[1] + ",";

         } else if (input[0].equals("R")) {
            t = t.replaceFirst("1,", "");
         }

      }
      String[] parts = t.split(",");
      for (int j = 0; j < parts.length; j++) {
         System.out.println(parts[j]);
      }

      /*
       * if (input[0].equals("F")) {
       * if (list.size() < 1) {
       * list.add(input[1]);
       * }
       * else {
       * list.add(0, input[1]);
       * }
       * }
       * if (input[0].equals("E")) {
       * list.add(input[1]);
       * }
       * if (input[0].equals("R")) {
       * list.remove(input[1]);
       * }
       * 
       * for (int i = 0; i < list.size(); i++) {
       * System.out.println(list.get(i));
       * }
       */
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

   static BufferedReader getBufferedReader(boolean fromFile) {
      try {
         if (fromFile) {
            br = new BufferedReader(new FileReader("test.txt"));
         } else {
            br = new BufferedReader(new InputStreamReader(System.in));
         }

         return br;

      } catch (Exception e) {
         e.printStackTrace();
         return null;
      }
   }
}