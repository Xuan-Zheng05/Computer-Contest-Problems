import java.util.*;
import java.io.*;
   
public class BoringBusiness { 
   
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
    
   public static void main(String[] args) throws IOException {
      
      int[][] wellPlan = new int[400][200];
      int f = 200;
      
      wellPlan[0+f][-1+f] = 1;
      wellPlan[0+f][-2+f] = 1;
      wellPlan[0+f][-3+f] = 1;
      wellPlan[1+f][-3+f] = 1;
      wellPlan[2+f][-3+f] = 1;
      wellPlan[3+f][-3+f] = 1;
      wellPlan[3+f][-4+f] = 1;
      wellPlan[3+f][-5+f] = 1;
      wellPlan[4+f][-5+f] = 1;
      wellPlan[5+f][-5+f] = 1;
      wellPlan[5+f][-4+f] = 1;
      wellPlan[5+f][-3+f] = 1;
      wellPlan[6+f][-3+f] = 1;
      wellPlan[7+f][-3+f] = 1;
      wellPlan[7+f][-4+f] = 1;
      wellPlan[7+f][-5+f] = 1;
      wellPlan[7+f][-6+f] = 1;
      wellPlan[7+f][-7+f] = 1;
      wellPlan[6+f][-7+f] = 1;
      wellPlan[6+f][-7+f] = 1;
      wellPlan[5+f][-7+f] = 1;
      wellPlan[4+f][-7+f] = 1;
      wellPlan[3+f][-7+f] = 1;
      wellPlan[2+f][-7+f] = 1;
      wellPlan[1+f][-7+f] = 1;
      wellPlan[0+f][-7+f] = 1;
      wellPlan[-1+f][-7+f] = 1;
      wellPlan[-1+f][-6+f] = 1;
      wellPlan[-1+f][-5+f] = 1; 
      
      int x = -1, y = -5, t = 1;  
      char direction = 'a';
      int d, distance;    
      int dr = 0, dc = 0;
      
      direction = readCharacter();
      distance = readInt();
      while (t == 1 && direction != 'q') {
         
         dc = 0; dr = 0;
         
         if(direction == 'l') {
            dc = -1;
         }
         else if(direction == 'u') {
            dr = 1;
         }
         else if(direction == 'r') {
            dc = 1;
         }
         else if(direction == 'd') {
            dr = -1;
         }
        
         while (distance > 0)
         {
            x = x + dc;
            y = y + dr;
            
            if(wellPlan[x+f][y+f] == 1)
            {
               t = 0;
            }
            else
            {
               wellPlan[x+f][y+f] = 1;
            }
            
            distance --;
         }
         
         if(t == 1) {
            System.out.printf("%d %d safe\n", x, y);
         }
         else if(t == 0) {
            System.out.printf("%d %d DANGER\n", x, y);
         } 
         direction = readCharacter();
         distance = readInt();             
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