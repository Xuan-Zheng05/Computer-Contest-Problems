import java.util.*;
import java.io.*;

public class MissingNumbers {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            long pairs = 0;
            long n = readInt();
            long newSum = readInt();
            long oldSum = (long) (((double) n) / 2 * (1 + n));
            long missing = oldSum - newSum;
            long mid = missing / 2;
            if (missing % 2 == 1) {
                pairs = Math.min(mid, n - mid);
            } else {
                pairs = Math.min(mid - 1, n - mid);
            }
            System.out.println(pairs);
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
