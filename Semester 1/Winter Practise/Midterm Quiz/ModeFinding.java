import java.util.*;
import java.io.*;
   
public class ModeFinding { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      int n = readInt();
      int num, times;
      for (int i = 0; i < n; i++) {
         num = readInt();
         
         if (map.get(num) == null) {
            map.put(num, 1);
         }
         else {
            times = map.get(num) + 1;
            map.put(num, times);      
         }
      }
      int most = 0;
      int highest = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         Integer key = entry.getKey();
         Integer value = entry.getValue();
         if (value == highest && key < most) {
            most = key;
            highest = value;
         }
         else if (value > highest) {
            most = key;
            highest = value;
         }
      }
      System.out.println(most);
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