import java.util.*;
import java.io.*;

public class TwoDPermutations {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), q = readInt();
        int dif[] = new int[n * m + 2];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int mi = i * j, mx = n * m - (n - i + 1) * (m - j + 1) + 1;
                dif[mi]++;
                dif[mx + 1]--;
            }
        }
        for (int i = 1; i < dif.length; i++)
            dif[i] += dif[i - 1];
        for (int i = 1; i <= q; i++) {
            System.out.println(dif[readInt()]);
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
