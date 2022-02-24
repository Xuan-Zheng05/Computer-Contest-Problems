import java.util.*;
import java.io.*;
// (a-b)%mod = ((a%mod) - (b%mod))%mod
// (a+b)%mod = ((a%mod + (b%mod))%mod
// (a*b)%mod = ((a%mod) * (b%mod))%mod
// (a/b)%mod ≠ ((a%mod) / (b%mod))%mod

public class ArithmeticOrGeometric {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        long M = 1000000007;
        for (int i = 0; i < t; i++) {
            int a = readInt(), b = readInt(), c = readInt();
            int k = readInt();
            int commonDifference = b - a;
            if (c - b == commonDifference) {
                long answer = (a + (k - 1) * commonDifference) % M;
                System.out.println(answer);
            } else {
                int commonRatio = b / a;
                long answer = factorial(a, commonRatio, k);
                System.out.println(answer);

            }
        }
    }

    static long factorial(int a, int commonRatio, int k) {
        long M = 1000000007;
        long value = a;
        for (int i = 1; i < k; i++) {
            if (value > Integer.MAX_VALUE) {
                value = (value % M * commonRatio) % M;
            } else {
                value = (value * commonRatio);
            }

        }

        return value % M;
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