import java.util.*;
import java.io.*;

public class RailwaySort {  
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      List<Integer> list = new ArrayList<Integer>();
      int numTrains, nextNumPos, largeNumPos;      
      int largestNum = 0;
      int nextNum = 0;
      int placesMoved;
   
      
      for (int i=0; i<10; i++) {
         
         placesMoved = 0;
         numTrains = sc.nextInt();
         String[] orderTrains = new String[numTrains];
                  
         sc.nextLine();
         orderTrains = sc.nextLine().split(" ");
         
         list.clear();
         for (int k = 0; k < orderTrains.length; k++) {
            list.add(Integer.parseInt(orderTrains[k]));
            
            if (largestNum<list.get(k)) {
               largestNum = list.get(k);
            }
         }
         
         for (int j = 0; j < numTrains-1; j++) {
            
            nextNum = 0;
            for (int z = 0; z < numTrains; z++) {
               
               if (nextNum<list.get(z) && list.get(z) < largestNum) {
                  nextNum = list.get(z);
               }           
            }
            if (list.indexOf(nextNum) > list.indexOf(largestNum)) {
               placesMoved = placesMoved + list.indexOf(nextNum);
               list.remove(list.indexOf(nextNum));
               list.add(0, nextNum);
            }
            largestNum = nextNum;
         }
         System.out.println(placesMoved);
         
      }
      
   }
}