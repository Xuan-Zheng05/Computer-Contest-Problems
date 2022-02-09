import java.util.*;
import java.io.*;
   
public class Jarvis { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      int neededNum;
      int n = readInt();
      int[] facFreq = new int[n]; 
      int[] reqFreq = new int[n];
      
      for (int i = 0; i < n; i++) {
         facFreq[i] = readInt();
      }
      for (int i = 0; i < n; i++) {
         reqFreq[i] = readInt();
         neededNum = facFreq[i] - reqFreq[i];
         
         if (map.get(neededNum) == null) {
            map.put(neededNum, 1);
         } else {
            map.put(neededNum, map.get(neededNum) +1);
         }
      }
      int v = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         int key = entry.getKey();
         int value = map.get(key);
         if(value > v) {
            v = value;
         }
      }
      System.out.println(v);
              
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