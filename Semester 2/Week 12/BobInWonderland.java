import java.util.*;
import java.io.*;

public class BobInWonderland {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt();
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = readInt();
        }
        Arrays.sort(heights);
        for (int i = 0; i < m; i++) {
            int t = readInt();
            int result = Arrays.binarySearch(heights, t);
            if (result > 0) {
                System.out.println(n - result);
            } else {
                System.out.println(n - (result * -1 - 1));
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
