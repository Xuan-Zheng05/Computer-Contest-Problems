import java.util.*;
import java.io.*;
   
public class SlotMachines { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      int counter = 0;
      int quarters = readInt(), mac1 = readInt(), mac2 = readInt(), mac3 = readInt();
      while (quarters > 0) {
         counter ++;
         
         if(counter % 3 == 0){
            mac3++;
            if(mac3 % 10 == 0){
               quarters += 9;
            }
         } else if(counter % 2  == 0) {
            mac2++;
            if(mac2 % 100 == 0){
               quarters += 60;
            }   
         } else {
            mac1++;
            if(mac1 % 35 == 0){
               quarters += 30;
            }
         }
         quarters--;
      }
      System.out.println("Martha plays " + counter + " times before going broke.");
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