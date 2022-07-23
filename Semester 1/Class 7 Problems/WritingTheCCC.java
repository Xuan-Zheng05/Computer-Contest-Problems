import java.util.*;
import java.io.*;

public class WritingTheCCC {

   static BufferedReader br = getBufferedReader(false);
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;

   public static void main(String[] args) throws IOException {

      Map<String, ArrayList> map = new HashMap<String, ArrayList>();
      int t = readInt();
      String[] types = new String[t];
      for (int i = 0; i < t; i++) {
         String type = readLine();
         types[i] = type;
         map.put(type, new ArrayList());
      }

      int n = readInt();
      for (int i = 0; i < n; i++) {
         String problem = readLine();
         List<Integer> tempList = map.get(problem);
         tempList.add(i + 1);
      }

      for (int i = 0; i < t; i++) {
         List<Integer> tempList = map.get(types[i]);
         for (int j = 0; j < tempList.size(); j++) {
            System.out.println(tempList.get(j));
         }
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