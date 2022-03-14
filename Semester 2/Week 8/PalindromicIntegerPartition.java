import java.util.*;
import java.io.*;

public class PalindromicIntegerPartition {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static long[] ways = new long[67];

    public static void main(String[] args) throws IOException {
        int n = readInt();

        System.out.println(f(n));
    }

    static long f(int n) {
        if (ways[n] > 0) {
            return ways[n];
        } else if (n <= 1) {
            return 1;
        }
        long sum = 1;

        for (int i = n - 2; i >= 0; i -= 2) {
            sum += f(i);
        }
        return ways[n] = sum;
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