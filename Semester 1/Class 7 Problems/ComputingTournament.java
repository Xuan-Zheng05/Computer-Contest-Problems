import java.util.*;
import java.io.*;
   
public class ComputingTournament { 
   
   static BufferedReader br = getBufferedReader(true);
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      int highest = 0;
      int highestPos = 0;
      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
      
      int n = readInt();
      int k = readInt();
      
      int[] round1Score = new int[n];
      int[] round2Score = new int[n];
      
      for (int i = 0; i < n; i++) {
         round1Score[i] = readInt();
         round2Score[i] = readInt();
      }
      for (int i = 0; i < k; i++) {
         highest = 0;
         highestPos = -1;         
         for (int j = 0; j < n; j++) {
            if (round1Score[j] > highest) {
               highest = round1Score[j];
               highestPos = j;
            }
         }      
         map.put(round2Score[highestPos], highestPos);
         round1Score[highestPos] = 0;
      }
      
      highest = 0;
      int value = 0;
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         int key = entry.getKey();
         if (key > highest) {
            highest = key;
            value = map.get(key);
         }
      }
      System.out.println(value + 1);
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
   static BufferedReader getBufferedReader (boolean fromFile) {
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