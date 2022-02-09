import java.util.*;
import java.io.*;

public class PermutationsAndProducts {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        long[] arr = new long[n - 1];

        long max = Long.MIN_VALUE;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n - 1; i++) {
            System.out.print("? " + 1 + " " + (i + 2) + "\n");
            System.out.flush();
            String a = readLine();
            arr[i] = Long.parseLong(a);
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        if (max == n) {
            System.out.print("! " + 1 + " ");
            for (int i = 0; i < n - 1; i++) {
                if (i == n - 2) {
                    System.out.print(arr[i]);
                } else {
                    System.out.print(arr[i] + " ");
                }

            }
            System.out.print("\n");
            System.out.flush();
        } else {
            System.out.print("! " + min + " ");
            for (int i = 0; i < n - 1; i++) {
                if (i == n - 2) {
                    System.out.print((arr[i] / min));
                } else {
                    System.out.print((arr[i] / min) + " ");
                }

            }
            System.out.print("\n");
            System.out.flush();
        }
        System.exit(0);
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