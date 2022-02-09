import java.util.*;
import java.io.*;

public class AFamiliarProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int best = 0;

        int n = readInt();
        long m = readLong();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
        }

        long sum = arr[0];

        for (int i = 0, j = 0; j < n;) {
            if (sum < m) {
                best = Math.max(best, j - i + 1);
                sum += arr[++j];

            } else {
                sum -= arr[i++];
                if (i > j)
                    sum += arr[++j];
            }
        }
        System.out.println(best);
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