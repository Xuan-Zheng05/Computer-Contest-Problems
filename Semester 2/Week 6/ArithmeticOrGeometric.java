import java.util.*;
import java.io.*;

public class ArithmeticOrGeometric {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        long M = 1000000007;

        for (int i = 0; i < t; i++) {
            long a = readInt(), b = readInt(), c = readInt();
            long k = readInt();
            long commonDifference = b - a;
            if (c - b == commonDifference) {
                long answer = (a + (k - 1) * commonDifference) % M;
                System.out.println(answer);
            } else {
                long commonRatio = b / a;
                long answer = cal(commonRatio, k - 1, 1000000007);
                answer = ((answer % M) * (a % M)) % M;
                System.out.println(answer);
            }
        }
    }

    static long cal(long N, long pow, long MOD) {

        if (N == 0 || N == 1) {
            return N % MOD;
        }

        if (pow == 0) {
            return 1;
        }
        if (MOD == 1) {
            return 0;
        }

        long ans = 1;

        while (pow != 0) {

            if (pow % 2 != 0) {
                ans = ((ans % MOD) * (N % MOD)) % MOD;
            }

            N = ((N % MOD) * (N % MOD)) % MOD;
            pow /= 2;
        }
        return ans;
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