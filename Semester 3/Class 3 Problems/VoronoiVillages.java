import java.util.*;
import java.io.*;

public class VoronoiVillages {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        double[] villages = new double[n];
        for (int i = 0; i < n; i++) {
            villages[i] = readDouble();
        }
        Arrays.sort(villages);
        double ans = Double.MAX_VALUE;
        for (int i = 1; i < n - 1; i++) {
            double v1 = Math.abs(villages[i] - villages[i - 1]);
            double v2 = Math.abs(villages[i + 1] - villages[i]);
            ans = Math.min(ans, v1 / 2.0 + v2 / 2.0);
        }
        System.out.printf("%.1f\n", ans);
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
