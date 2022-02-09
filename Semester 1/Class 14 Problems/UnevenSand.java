import java.util.*;
import java.io.*;

public class UnevenSand {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String input;
        int low = 1, high = 2000000000;

        while (low <= high) {
            int mid = low + ((high - low) / 2);

            System.out.println(mid);
            System.out.flush();

            input = readLine();
            if (input.equals("SINKS")) {
                low = mid + 1;
            } else if (input.equals("FLOATS")) {
                high = mid - 1;
            } else if (input.equals("OK")) {
                System.exit(0);
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