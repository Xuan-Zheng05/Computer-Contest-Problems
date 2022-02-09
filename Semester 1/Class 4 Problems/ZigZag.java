import java.io.*;
import java.util.*;

public class ZigZag {
   public static void main(String[] args) {
      
      try {
      
         Scanner sc;
         boolean fromFile = true;
         
         if (fromFile) {
            sc= new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }
         
         int numWords = sc.nextInt();
         int numLetters = sc.nextInt();
         
         List<String> list = new ArrayList<String>();
         
         sc.nextLine();
         for (int i = 0; i < numWords; i++) {
            list.add(sc.nextLine());
         }
         
         Collections.sort(list);
         HashMap<String,Integer> map1 = new HashMap();
         HashMap<String,Integer> map2 = new HashMap();

         for (int i = 0; i < numWords; i++) {
            String s = list.get(i).substring(0,1);
            if(map1.get(s) != null){
               map1.put(s, map1.get(s)+1);
            }else{
              map1.put(s, 1);            
            }
         }
         
         int start = 0;
         for (int i =0; i<map1.size();i++){
            String s = map1.keySet().toArray()[i];
            //start += 
            if(map2.size() == 0){
               map2.put(s,0);
            }else{
               
            }
            
         }

         String alpha = "abcdefghijklmnopqrstuvwxyz";
         
         for (int j = 0; j < numLetters; j++) {
            String letter = sc.nextLine();            
                 
            for (int k = 0; k < numWords; k++) {
            
               if (list.get(k).startsWith(letter)) {       
                  System.out.println(list.get(k));
                  list.add(list.get(k)); 
                  list.remove(k);
                  break;
               }
            }       
         }
      
      } catch (Exception e) {
         e.printStackTrace();
      }
      
   }
}