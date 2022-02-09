import java.util.*;
import java.io.*;

public class DamageOutput {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        long m = readLong();

        long[] arr = new long[500000];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
        }
        for (int i = 1; i < n; i++) {
            arr[i] += arr[i - 1];
        }

        int smallest = Integer.MAX_VALUE;
        int r = 0, l = 0;

        for (; r < n;) {
            long s = l > 0 ? arr[r] - arr[l - 1] : arr[r];
            if (s >= m) {
                smallest = Math.min(smallest, r - l + 1);
                l++;
            } else {
                r++;
            }
        }

        if (smallest == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(smallest);
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