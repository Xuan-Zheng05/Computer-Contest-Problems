import java.util.*;
import java.io.*;

public class BabblingBrooks {  
   public static void main(String[] args) {
   
      List<Integer> list = new ArrayList<Integer>();
      int splitJoin, input, stream, percentage;
      Scanner sc = new Scanner(System.in);
      
      int numStreams = sc.nextInt();
      
      for (int i=0; i<numStreams; i++) {
         int flowStreams = sc.nextInt();
         list.add(flowStreams);
      }
      
      splitJoin = sc.nextInt();
   
      do {
         
         if (splitJoin == 99) {
            stream = sc.nextInt();
            percentage = sc.nextInt();
            
            int newStream = list.get(stream-1);
            list.set(stream - 1, newStream * percentage / 100); 
            list.add(stream, newStream - newStream * percentage / 100);
         }       
         
         if (splitJoin == 88) {
            stream = sc.nextInt();
            list.set(stream - 1, list.get(stream-1) + list.get(stream)); 
            list.remove(stream);
            
         }
         splitJoin = sc.nextInt();
       
      } while (splitJoin != 77);
      
      for (int j=0; j<list.size(); j++) {
         System.out.print(list.get(j) + " ");
      }
   }
}