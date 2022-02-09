import java.util.*;
import java.io.*;

public class TheGreatRevegetation {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] a = new int[151];
        int[] b = new int[151];
        int[] c = new int[101];

        int n = readInt();
        int m = readInt();
        for (int i = 0; i < m; i++) {
            a[i] = readInt();
            b[i] = readInt();

            if (a[i] > b[i]) {
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }
        }

        for (int i = 1; i <= n; i++) {
            int g;
            for (g = 1; g <= 4; g++) {
                boolean ok = true;
                for (int j = 0; j < m; j++) {
                    if (b[j] == i && c[a[j]] == g)
                        ok = false;
                }
                if (ok) {
                    break;
                }
            }
            c[i] = g;
            System.out.print(g);
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