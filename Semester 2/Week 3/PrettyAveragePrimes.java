import java.util.*;
import java.io.*;

public class PrettyAveragePrimes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            int n = readInt();
            int a = 0, b = 0;
            boolean primeA = true;
            boolean primeB = true;
            for (int j = 2; j <= n * 2; j++) {
                primeA = true;
                primeB = true;
                a = j;
                b = 2 * n - j;
                primeA = isPrime(a);
                primeB = isPrime(b);
                if (primeA && primeB) {
                    if (a + b == n * 2) {
                        break;
                    }
                }
            }
            System.out.println(a + " " + b);
        }
    }

    static boolean isPrime(int n) {
        if (n <= 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
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