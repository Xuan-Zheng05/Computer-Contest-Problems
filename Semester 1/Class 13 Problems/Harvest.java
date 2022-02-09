import java.util.*;
import java.io.*;

public class Harvest {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), k = readInt();
        int[] field = new int[n];

        Arrays.fill(field, 5);
        for (int i = 0; i < m; i++) {
            int a = readInt();
            int b = readInt();
            for (int j = a - 1; j < b; j++) {
                field[j]--;
            }

        }

        int[] psa = new int[n];
        psa[0] = field[0];
        for (int i = 1; i < n; i++) {
            psa[i] = psa[i - 1] + field[i];
        }
        // 3 5 7 10 13
        int ans = Integer.MAX_VALUE;
        if (psa[0] >= k) {
            System.out.println(1);
            return;
        }
        for (int L = 1, R = 1; R <= n; R++) {
            while (psa[L] - psa[R - 1] < k) {

                L++;
                if (L > n - 1) {
                    if (ans == Integer.MAX_VALUE) {
                        System.out.println(-1);
                    } else {
                        System.out.println(ans);
                    }
                    return;
                }

            }
            ans = Math.min(ans, L - R + 1);
            L = R;
        }

        if (ans == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(ans);
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