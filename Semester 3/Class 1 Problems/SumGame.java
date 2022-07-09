import java.util.*;
import java.io.*;

public class SumGame {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] psaSwift = new int[n];
        int[] psaSema = new int[n];

        int k = 0;
        psaSwift[0] = readInt();
        for (int i = 1; i < n; i++) {
            psaSwift[i] = readInt() + psaSwift[i - 1];
        }
        psaSema[0] = readInt();
        if (psaSema[0] == psaSwift[0]) {
            k = 1;
        }
        for (int i = 1; i < n; i++) {
            psaSema[i] = readInt() + psaSema[i - 1];
            if (psaSema[i] == psaSwift[i]) {
                k = i + 1;
            }
        }
        System.out.println(k);
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
