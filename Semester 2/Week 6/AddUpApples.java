import java.util.*;
import java.io.*;

public class AddUpApples {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int total = 0;

    public static void main(String[] args) throws IOException {
        int n = readInt();

        for (int i = 1; i <= n / 2; i++) {
            findWays("" + i, i, i, n);
        }
        System.out.println("total=" + total);
    }

    static void findWays(String way, int lastNum, int sum, int n) {
        for (int i = 0; i < n; i++) {
            int tempSum = sum;
            tempSum += lastNum + i;

            if (tempSum < n) {
                String n_way = way + "+" + (lastNum + i);
                findWays(n_way, lastNum + i, tempSum, n);
            } else if (tempSum == n) {
                String n_way = way + "+" + (lastNum + i);
                total++;
                System.out.println(n + "=" + n_way);
            }
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