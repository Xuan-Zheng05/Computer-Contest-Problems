import java.util.*;
import java.io.*;

public class Test {

   static int[] array;

   public static void main(String[] args) {
      int[] oldArray = { 1, 2 };
      array = oldArray;

      getAllOrder(0, array.length - 1);
   }

   public static void getAllOrder(int begin, int end) {
      if (begin == end) {
         check();
      } else {
         for (int i = begin; i <= end; i++) {
            swap(begin, i);
            getAllOrder(begin + 1, end);
            swap(i, begin);
         }
      }
   }

   public static void swap(int from, int to) {
      if (from == to) {
         return;
      }
      int temp = array[from];
      array[from] = array[to];
      array[to] = temp;
   }

   public static void check() {
      System.out.println(Arrays.toString(array));
   }
}