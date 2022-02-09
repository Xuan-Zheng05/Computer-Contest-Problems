import java.util.*;
import java.io.*;
   
public class PowerRanking { 
   
   static BufferedReader br;
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
     
      try {
         boolean fromFile = true;
         
         if (fromFile) {
            br = new BufferedReader(new FileReader("test.txt"));
         } else {
            br = new BufferedReader(new InputStreamReader(System.in));
         }   
      
         int students = readInt();
         int presentations = readInt();
          
         String[] names = new String[students];
         int[] score = new int[students];
      
         for (int i = 0; i < students; i++) {
            names[i] = readLine();
         }
      
         for (int i = 0; i < presentations; i++) 
            for (int j = 0; j < students; j++) {
               score[j] += readInt();
            }
      
         for (int i = 3; i < students + 3; i++) {
         
            int bestMember = -1, bestScore = -1;
            for (int j = 0; j < students; j++) {
               if (score[j] > bestScore) {
                  bestScore = score[j];
                  bestMember = j;
               }
            }        
            System.out.println(i + ". " + names[bestMember]);
            score[bestMember] = -1;
         }
      } catch (Exception e) {
         e.printStackTrace();
      }
      
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