import java.util.*;
import java.io.*;

public class BobsLightGame {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int m = readInt();
        int[] dif = new int[n + 2];

        for (int i = 0; i < m; i++) {
            int L = readInt();
            int R = readInt();
            dif[L]++;
            dif[R + 1]--;
        }
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            dif[i] += dif[i - 1];
            if (dif[i] % 2 == 1)
                ans++;
        }
        System.out.println(ans);
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