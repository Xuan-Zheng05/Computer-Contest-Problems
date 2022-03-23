import java.util.*;
import java.io.*;

public class ObligatoryTriangleProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        double n = readInt(), a = readInt();
        int ans = 0;
        double prevDifference = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            double x = readInt(), y = readInt();
            double degrees = Math.toDegrees(Math.atan2(y, x));
            if (Math.abs(degrees - a) > 180) {
                if (Math.abs((degrees + 360) - a) < prevDifference) {
                    prevDifference = Math.abs((degrees + 360) - a);
                    ans = i;
                }
            } else {
                if (Math.abs(degrees - a) < prevDifference) {
                    prevDifference = Math.abs(degrees - a);
                    ans = i;
                }
            }
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
