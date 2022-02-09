import java.util.*;
import java.io.*;

public class UdderedButNotHerd {  
   public static void main(String[] args) {
         
      Scanner sc = new Scanner(System.in);
      String alphabet = sc.next();
   	
      int[] rank = new int[26];
   	
      for (int i=0; i<alphabet.length(); i++)
         rank[alphabet.charAt(i)-'a'] = i;
   	
      String phrase = sc.next();
   	
      int times = 0, curRank = 26;
      for (int i=0; i<phrase.length(); i++) {
      
         int newRank = rank[phrase.charAt(i)-'a'];
      	
         if (newRank <= curRank) times++;
      	
         curRank = newRank;
      }
   	
      System.out.println(times);
   }
}