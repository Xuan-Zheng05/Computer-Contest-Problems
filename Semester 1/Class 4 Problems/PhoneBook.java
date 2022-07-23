import java.io.*;
import java.util.*;

public class PhoneBook {
   public static void main(String[] args) {

      try {

         Scanner sc;
         boolean fromFile = true;

         if (fromFile) {
            sc = new Scanner(new File("test.txt"));
         } else {
            sc = new Scanner(System.in);
         }

         int numFriends = Integer.parseInt(sc.nextLine());

         HashMap<Integer, String> phone_name = new HashMap<Integer, String>();
         HashMap<Integer, Integer> phone_num = new HashMap<Integer, Integer>();

         for (int i = 0; i < numFriends; i++) {

            String input[] = sc.nextLine().split(" ");

            phone_name.put(Integer.parseInt(input[1]), input[0]);
            phone_num.put(Integer.parseInt(input[1]), 0);
         }

         int numCalls = Integer.parseInt(sc.nextLine());
         int[] calls = new int[numCalls];

         int maxcall = 0;

         String p_name = "";
         int phone_number = 999999999;

         for (int j = 0; j < numCalls; j++) {
            int phoneNumber = Integer.parseInt(sc.nextLine());
            int newCallNum = phone_num.get(phoneNumber) + 1;

            phone_num.put(phoneNumber, newCallNum);

            if (newCallNum > maxcall) {
               maxcall = newCallNum;
               p_name = phone_name.get(phoneNumber);
               phone_number = phoneNumber;

            } else if (newCallNum == maxcall) {
               if (phoneNumber < phone_number) {
                  maxcall = newCallNum;
                  p_name = phone_name.get(phoneNumber);
                  phone_number = phoneNumber;

               }
            }

         }

         System.out.println(p_name);

      } catch (Exception e) {
         e.printStackTrace();
      }

   }
}