import java.util.*;
import java.io.*;

public class VictorsMoralDilemma {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), d = readInt();

        int[] psa = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            psa[i] = psa[i - 1] + readInt();
        }

        int bottom = 0, top = n;
        for (int i = 0; i < d; i++) {
            int split = readInt();
            if (psa[split + bottom] - psa[bottom] >= psa[top] - (psa[split] -
                    psa[bottom])) {
                System.out.println(psa[split + bottom] - psa[bottom]);
                bottom = split;
            } else {
                System.out.println(psa[top] - psa[split + bottom]);
                top = split;
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
