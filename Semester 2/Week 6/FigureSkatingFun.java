import java.util.*;
import java.io.*;

public class FigureSkatingFun {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] psa = new int[n];
        psa[0] = readInt();
        for (int i = 1; i < n; i++) {
            psa[i] = readInt() + psa[i - 1];
        }
        for (int i = 0; i < n; i++) {
            if (psa[i] == psa[n - 1] - psa[i]) {
                System.out.println(i + 1);
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