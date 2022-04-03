import java.util.*;
import java.io.*;

public class BobsMaximalSequenceSum {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = readInt();
        }

        long maximum = 0;
        for (int i = 0; i < n - 2; i++) {
            if (b[i] < b[i + 1]) {
                maximum += b[i] * 2;
                i++;
            } else {
                maximum += b[i];
            }
        }
        System.out.println(maximum + b[n - 2]);
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
