import java.util.*;
import java.io.*;

public class JamesEGirlDiscordStatus {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        long[] psa = new long[50];
        long[] min = new long[50];
        for (int i = 1; i <= n; i++) {
            psa[i] = readInt();
            psa[i] += psa[i - 1];
        }
        for (int i = 0; i <= k - 1; i++) {
            min[i] = psa[i];
        }
        long highest = 0;
        for (int i = k; i <= n; i++) {
            int rem = i % k;
            highest = Math.max(highest, psa[i] - min[rem]);
            min[rem] = Math.min(min[rem], psa[i]);
        }
        // int multiple = k;
        // long highest = psa[k - 1] >= 0 ? psa[k - 1] : 0;
        // for (int i = 0; i < n / k; i++) {
        // highest = Math.max(highest, psa[multiple - 1]);
        // for (int j = multiple; j < n; j++) {
        // highest = Math.max(highest, psa[j] - psa[j - multiple]);
        // }
        // multiple += k;
        // }
        if (highest < 0) {
            System.out.println(0);
        } else {
            System.out.println(highest);
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