import java.util.*;
import java.io.*;

public class COWOperations {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] s = readLine().toCharArray();
        int n = s.length;
        int[] c = new int[n + 1];
        int[] o = new int[n + 1];
        int[] w = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            c[i] = c[i - 1];
            o[i] = o[i - 1];
            w[i] = w[i - 1];
            if (s[i - 1] == 'C') {
                c[i]++;
            }
            if (s[i - 1] == 'O') {
                o[i]++;
            }
            if (s[i - 1] == 'W') {
                w[i]++;
            }
        }
        int q = readInt();
        for (int i = q; i > 0; i--) {
            int L = readInt(), R = readInt();
            int numC = c[R] - c[L - 1], numO = o[R] - o[L - 1], numW = w[R] - w[L - 1];
            numC += numW;
            numO += numW;

            if (numC % 2 == 1 && numO % 2 == 0) {
                System.out.print("Y");
            } else {
                System.out.print("N");
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
