import java.util.*;
import java.io.*;

public class UnicycleLicense {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        double m = readInt();
        double a = 12, b = -5, c = 1 - m;

        double root1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double root2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (root1 < 0) {
            System.out.println(root2);
        } else {
            System.out.println(root1);
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
