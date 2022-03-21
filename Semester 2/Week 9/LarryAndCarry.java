import java.util.*;
import java.io.*;

public class LarryAndCarry {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, a[], ans = 0;

    public static void main(String[] args) throws IOException {
        n = readInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
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
            boolean flag = true;
            int num = a[comb.get(0) - 1];
            for (int i = 1; i < comb.size(); i++) {
                flag = carry(num, a[comb.get(i) - 1]);
                if (!flag) {
                    break;
                }
                num += a[comb.get(i) - 1];
            }
            if (flag) {
                ans = Math.max(ans, comb.size());
            }
            return;
        }
        fun(cur + 1, n, comb);
        comb.add(cur);
        fun(cur + 1, n, comb);
        comb.remove(comb.size() - 1);
    }

    static boolean carry(int a, int b) {
        boolean flag = true;
        while (a != 0 && b != 0) {
            int tempA = a % 10;
            int tempB = b % 10;
            if (tempA + tempB > 9) {
                flag = false;
                break;
            }
            a = a / 10;
            b = b / 10;
        }
        return flag;
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