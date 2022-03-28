import java.util.*;
import java.io.*;

public class CtudorsCuteOrchids {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, m, c[], d[], a[][], need[], ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        n = readInt();
        m = readInt();
        c = new int[n + 1];
        d = new int[m + 1];
        a = new int[m + 1][n + 1];
        need = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            c[i] = readInt();
        }
        for (int i = 1; i <= m; i++) {
            d[i] = readInt();
            for (int j = 1; j <= n; j++) {
                a[i][j] = readInt();
            }
        }
        for (int i = 1; i <= n; i++) {
            need[i] = readInt();
        }

        List<Integer> comb = new ArrayList<>();
        fun(1, m, comb);
        System.out.println(ans);
    }

    static void fun(int cur, int m, List<Integer> comb) {

        if (cur > m) {
            int[] cnt = new int[n + 1];
            int amount = 0;
            for (int x : comb) {
                for (int i = 1; i <= n; i++) {
                    cnt[i] += a[x][i];
                }
                amount += d[x];
            }
            for (int i = 1; i <= n; i++) {
                if (cnt[i] > need[i]) {
                    return;
                }
                amount += c[i] * (need[i] - cnt[i]);
            }
            ans = Math.min(ans, amount);
            return;

        }
        fun(cur + 1, m, comb);
        comb.add(cur);
        fun(cur + 1, m, comb);
        comb.remove(comb.size() - 1);
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
