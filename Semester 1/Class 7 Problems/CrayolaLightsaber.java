import java.util.*;
import java.io.*;
   
public class CrayolaLightsaber { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
   
      int red, orange, yellow, blue, green, black; 
      red = orange = yellow = blue = green = black = 0;
      
      int n = readInt();
      String[] markers = readLine().split(" ");
      
      for (int i = 0; i < n; i++) {
         if (markers[i].equals("red")) red++;
         else if (markers[i].equals("orange")) orange++;
         else if (markers[i].equals("yellow")) yellow++;
         else if (markers[i].equals("blue")) blue++;
         else if (markers[i].equals("green")) green++;
         else if (markers[i].equals("black")) black++;        
      }     
       
      int[] numMarkers = {red, orange, yellow, green, blue, black};
      for (int i = 0; i < 6; i++) {
         if (numMarkers[i] > n - numMarkers[i]) {
            if (i == 0) {
               System.out.println((orange+yellow+green+blue+black)*2 + 1);
            }
            else if (i == 1) {
               System.out.println((red+yellow+green+blue+black)*2 + 1);
            }
            else if (i == 2) {
               System.out.println((red+orange+green+blue+black)*2 + 1);
            }
            else if (i == 3) {
               System.out.println((red+orange+yellow+blue+black)*2 + 1);
            }
            else if (i == 4) {
               System.out.println((red+orange+yellow+green+black)*2 + 1);
            }
            else if (i == 5) {
               System.out.println((red+orange+yellow+green+blue)*2 + 1);
            }
            System.exit(0);
         }
      }
      System.out.println(n);
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