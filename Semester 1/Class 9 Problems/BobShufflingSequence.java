import java.util.*;
import java.io.*;

public class BobShufflingSequence {

   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
   static StringTokenizer st;
   static int[] array;
   static int max;

   public static void main(String[] args) throws IOException {

      int n = readInt();
      int[] oldArray = new int[n];

      for (int i = 0; i < n; i++) {
         oldArray[i] = readInt();
      }

      array = oldArray;

      getAllOrder(0, array.length - 1);
      System.out.println(max);
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
      int newMax = 0;
      int[] newArray = new int[5];
      int[] maxArray = new int[5];
      for (int i = 0; i < array.length - 1; i++) {
         newMax += Math.abs(array[i] - array[i + 1]);
         newArray[i] = array[i];
      }
      newArray[4] = array[4];
      if (newMax > max) {
         max = newMax;
         for (int i = 0; i < 5; i++) {
            System.out.print(newArray[i] + " ");
         }
         System.out.println();
      }
   }

   static String next() throws IOException {
      while (st == null || !st.hasMoreTokens())
         st = new StringTokenizer(br.readLine().trim());
      return st.nextToken();
   }

   static long readLong() throws IOException {
      return Long.parseLong(next());
   }

   static int readInt() throws IOException {
      return Integer.parseInt(next());
   }

   static double readDouble() throws IOException {
      return Double.parseDouble(next());
   }

   static char readCharacter() throws IOException {
      return next().charAt(0);
   }

   static String readLine() throws IOException {
      return br.readLine().trim();
   }
}