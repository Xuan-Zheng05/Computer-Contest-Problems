import java.util.*;
import java.io.*;

public class Perket {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, bit[], sour[], ans = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        n = readInt();
        bit = new int[n + 1];
        sour = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sour[i] = readInt();
            bit[i] = readInt();
        }
        List<Integer> comb = new ArrayList<>();
        fun(1, n, comb);
        System.out.println(ans);
    }

    static void fun(int cur, int n, List<Integer> comb) {
        if (cur > n) {
            if (comb.isEmpty()) {
                return;
            }
            int totalSour = 1, totalBitter = 0;
            for (int x : comb) {
                totalSour *= sour[x];
                totalBitter += bit[x];
            }
            ans = Math.min(ans, Math.abs(totalSour - totalBitter));
            return;

        }
        fun(cur + 1, n, comb); // not add
        comb.add(cur); // add
        fun(cur + 1, n, comb); // method
        comb.remove(comb.size() - 1); // remove
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