import java.io.*;
import java.util.*;

public class PartyInvitation {
   public static void main(String[] args) {
   
      Scanner in = new Scanner(System.in);
   
      ArrayList<Integer> friends = new ArrayList();
      ArrayList<Integer> friends2 = new ArrayList();
      
      int K = in.nextInt();
      int m = in.nextInt();
      
      int[] rS = new int[m];
      for(int i = 0; i < m; i++) {
         rS[i] = in.nextInt();
      }
      
      for(int i = 0; i < K; i++){
         friends.add(i + 1);
      }
      
      for(int round = 0; round < m; round++){
         for(int i = 1; i < friends.size() + 1; i++){
            if(i % rS[round] != 0){
               friends2.add(friends.get(i - 1));
            }
         }
         
         friends = friends2;
         friends2 = new ArrayList();
      }
      
      for(int i = 0; i < friends.size(); i++){
         System.out.println(friends.get(i));
      }
       
   }
}