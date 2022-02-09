import java.util.*;
import java.io.*;

public class BoilingWater {  
   public static void main(String[] args) {
      
      int boilingPoint, pressure, seaLevel;
      Scanner sc = new Scanner(System.in);
      
      boilingPoint = sc.nextInt();
      
      pressure = boilingPoint * 5 - 400;
      
      if (pressure < 100) {
         seaLevel = 1;
      }
      else if (pressure > 100) {
         seaLevel = -1;
      }
      else {
         seaLevel = 0;
      }
      
      System.out.println(pressure);
      System.out.println(seaLevel);
      
   }
}
