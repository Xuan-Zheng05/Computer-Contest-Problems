import java.util.*;
import java.io.*;

public class ChocolateDay {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), dif[] = new int[n + 2];
        long psa[] = new long[n + 2];
        for (int i = 1; i <= m; i++) {
            int a = readInt(), b = readInt(), c = readInt();
            dif[a] += c;
            dif[b + 1] -= c;
        }
        for (int i = 1; i <= n; i++) {
            dif[i] += dif[i - 1];
            psa[i] = psa[i - 1] + dif[i];
        }
        int limit = readInt(), ans = 0;
        for (int L = 1, R = 1; R <= n; R++) {
            while (psa[R] - psa[L - 1] > limit) {
                L++;
            }
            ans = Math.max(ans, R - L + 1);
        }
        System.out.println(ans);
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