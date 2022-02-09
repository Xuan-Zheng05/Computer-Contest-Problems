import java.io.*;
import java.util.*;

public class ComfortableCows {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      boolean[][] pasture = new boolean[2000][2000];
      int[][]test = new int[2000][2000];
      ArrayList<Integer> placedCowsX = new ArrayList();
      ArrayList<Integer> placedCowsY = new ArrayList();
            
      int numCows = sc.nextInt();
      
      sc.nextLine();
      int comCows = 0;

      for (int i = 0; i < numCows; i++) {
         
         String cowPosition[] = sc.nextLine().split(" ");
         
         int x = Integer.parseInt(cowPosition[0]);
         int y = Integer.parseInt(cowPosition[1]);
         int comfortable = 0;
         pasture[x][y] = true;
         for (int[] another : new int[][]{{x - 1, y}, {x + 1, y}, {x, y - 1}, {x, y + 1}}) {
            int w = another[0];
            int z = another[1];
            if(w>=0 && z>=0){
               if (pasture[w][z] == true) {
                  test[w][z]++;
                  if(test[w][z] ==3){
                     comCows ++;
                  }
                  if(test[w][z] ==4){
                     comCows --;
                  }

                  comfortable ++;
               }
            }
         }
         test[x][y]= comfortable;
         if(comfortable ==3){
            comCows ++;
         }       
                                                 
         System.out.println(comCows);
      }
      
   }  
}
