import java.util.*;
import java.io.*;

public class ThatMissingNumber {  
   public static void main(String[] args) {
      
      int remainNum, totalNum;
      Scanner sc = new Scanner(System.in);
      
      for (int k = 0; k<5; k++) {
         int haveNum = 0;
         remainNum = sc.nextInt();
         
         totalNum = ((remainNum+1) * (remainNum + 2)) / 2;
         for (int i = 0; i<remainNum; i++) {
            haveNum = haveNum + sc.nextInt();  
         }      
         System.out.println(totalNum - haveNum);
      }
      
   }
}