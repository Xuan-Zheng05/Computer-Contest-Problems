import java.io.*;
import java.util.*;

public class UniqueElements {
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
   
      int[] usedElements = new int[sc.nextInt()];
      HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();   
      
      for (int i = 0; i < usedElements.length; i++) {        
         usedElements[i] = sc.nextInt();    
      }
          
      for (int j = 0; j < usedElements.length; j++) {   
         hashmap.put(usedElements[j], j);   
      }   
      
      System.out.println(hashmap.size());   
      
   }
}