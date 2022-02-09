import java.util.*;
import java.io.*;
   
public class ConditionalContracts { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();    
      int w, temp; 
      int highest = 0, secondHighest = 0;
      
      int n = readInt();
      for (int i = 0; i < n; i++) {
         w = readInt();
         if (map.get(w) == null) {
            map.put(w, 1);
         }
         else {
            temp = map.get(w) + 1;
            map.put(w, temp);
         }
      }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         int key = entry.getKey();
         if (map.get(key) >= highest) {
            secondHighest = highest;
            highest = map.get(key);
         }
         else if (map.get(key) > secondHighest) {
            secondHighest = map.get(key);
         }  
      }
      System.out.println(highest + secondHighest);
      
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