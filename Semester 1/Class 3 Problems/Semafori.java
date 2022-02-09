import java.io.*;
import java.util.*;

public class Semafori {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
    
      String temp1[] = sc.nextLine().split(" ");
      int numLights = Integer.parseInt(temp1[0]);
      int lengthRoad = Integer.parseInt(temp1[1]);
      
      int x = 0, time = 0;
      for (int i = 0; i < numLights; i++) {
      
         String temp2[] = sc.nextLine().split(" ");
         int distanceFromStart = Integer.parseInt(temp2[0]);
         int redTime = Integer.parseInt(temp2[1]);
         int greenTime = Integer.parseInt(temp2[2]);
         
         time += distanceFromStart - x;
         x = distanceFromStart;
         
         while(time % (redTime + greenTime) < redTime ) ++time;        
      }
      
      time += lengthRoad - x;
      x = lengthRoad;
      
      System.out.println(time);
      
   }
}
