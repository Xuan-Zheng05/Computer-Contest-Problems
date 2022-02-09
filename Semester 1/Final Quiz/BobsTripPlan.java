import java.util.*;
import java.io.*;

public class BobsTripPlan {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();

        int[] attractions = new int[n];
        for (int i = 0; i < n; i++) {
            attractions[i] = readInt();
        }

        for (int i = 0; i < n; i++) {
            int distance = 0;
            int previous = 0;
            if (i == 0) {
                previous = attractions[i];
                attractions[i] = 0;
            } else {
                previous = attractions[i];
                attractions[i] = attractions[i - 1];
            }
            distance += Math.abs(attractions[0]);
            for (int j = 0; j < n - 1; j++) {
                distance += Math.abs(attractions[j] - attractions[j + 1]);
            }
            distance += Math.abs(attractions[n - 1]);

            System.out.println(distance);
            attractions[i] = previous;
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