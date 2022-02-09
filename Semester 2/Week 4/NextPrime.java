import java.util.*;
import java.io.*;

public class NextPrime {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = (int) Math.sqrt(Integer.MAX_VALUE);
        boolean[] isPrime = new boolean[k];
        for (int i = 2; i * i <= n; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i + i; j < Math.sqrt(n); j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = n; i < 50; i++) {
            boolean checkPrime = isPrime[i];
            if (checkPrime) {
                System.out.println(i);
                break;
            }
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