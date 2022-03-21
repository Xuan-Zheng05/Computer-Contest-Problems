import java.util.*;
import java.io.*;

public class RimurusNumberGame {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static int valid = 0;
    static long n;

    public static void main(String[] args) throws IOException {
        n = readLong();
        find(0);
        System.out.println(valid - 1);
    }

    static void find(long x) {
        if (x > n) {
            return;
        }
        valid++;
        long x1 = x * 10 + 2;
        long x2 = x * 10 + 3;

        find(x1);
        find(x2);
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