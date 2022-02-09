import java.util.*;
import java.io.*;

public class MicrowaveButtons {  
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      
      String time, nums;
      int validNum;
      boolean[] numbers = new boolean[10];
      
      time = sc.nextLine();
      nums = sc.nextLine();
      
      int H = Integer.parseInt(time.substring(0, 2));
      int M = Integer.parseInt(time.substring(3, 5));
      int S = Integer.parseInt(time.substring(6, 8));
      
      int T = S + 60 * M + 3600 * H;
      
      for (int i = 0; i<nums.length(); i++) {
         validNum = nums.charAt(i);
         numbers[validNum - '0'] = true;
      }
      
      int bestH = 0, bestM = 0, bestS = 0, bestT = 5000000;
      
      for (int z = 0; z < 10; z++) {
         for (int j = 0; j < 10; j++) {
            for (int k = 0; k < 10; k++) {
            
               if (numbers[z / 10] && numbers[z - z / 10 * 10] &&
                    numbers[j / 10] && numbers[j - j / 10 * 10] &&
                    numbers[k / 10] && numbers[k - k / 10 * 10] &&
                    Math.abs((z * 3600 + j * 60 + k) - T) < bestT) {
                    
                  bestH = z; bestM = j; bestS = k; bestT = Math.abs((z * 3600 + j * 60 + k) - T);
               }
            }
         }
      }
      
      String strBestH = bestH + "";
      String strBestM = bestM + "";
      String strBestS = bestS + "";
      
      if (bestH < 10) {
         strBestH = "0" + bestH;
      }
      if (bestM < 10) {
         strBestM = "0" + bestM;
      }
      if (bestS < 10) {
         strBestS = "0" + bestS;
      }
      
      System.out.println(strBestH + ":" + strBestM + ":" + strBestS);
   
   }
}