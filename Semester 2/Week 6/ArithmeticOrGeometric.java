import java.util.*;
import java.io.*;

public class ArithmeticOrGeometric {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            int a = readInt(), b = readInt(), c = readInt();
            int k = readInt();
            int commonDifference = b - a;
            if (c - b == commonDifference) {
                System.out.println(a + (k - 1) * commonDifference);
            } else {
                int commonRatio = b / a;
                System.out.println(a * Math.pow(commonRatio, k - 1));
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