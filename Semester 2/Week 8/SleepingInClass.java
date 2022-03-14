import java.util.*;
import java.io.*;

public class SleepingInClass {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            int n = readInt();
            int[] a = new int[n + 1];
            int[] psa = new int[n + 1];
            Set<Integer> exist = new HashSet<Integer>();

            for (int j = 1; j <= n; j++) {
                a[j] = readInt();
                psa[j] = psa[j - 1] + psa[j];
                exist.add(psa[i]);
            }
            int sum = psa[n], ans = n;

            if (sum == 0) {
                System.out.println(0);
                continue;
            }

            for (int len = n; len >= 1; len--) {

                if (sum % len != 0) {
                    continue;
                }
                int value = sum / len;
                boolean flag = true;

                for (int x = value; x <= sum; x += value) {
                    if (!exist.contains(x)) {
                        flag = false;
                    }
                }
                if (flag) {
                    ans = n - len;
                    break;
                }
            }
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
