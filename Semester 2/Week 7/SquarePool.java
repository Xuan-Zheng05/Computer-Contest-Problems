import java.util.*;
import java.io.*;

public class SquarePool {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), t = readInt();
        int[][] pool = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                pool[i][j] = 1;
            }
        }
        for (int i = 0; i < t; i++) {
            int r = readInt(), c = readInt();
            pool[r - 1][c - 1] = 0;
        }
        int largestSquare = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (pool[i][j] != 0) {
                    if (i != 0 && j != 0) {
                        int up = pool[i - 1][j];
                        int left = pool[i][j - 1];
                        int diagonal = pool[i - 1][j - 1];
                        pool[i][j] = Math.min(up, Math.min(left, diagonal)) + 1;
                    }
                    if (pool[i][j] > largestSquare) {
                        largestSquare = pool[i][j];
                    }
                }
            }
        }
        System.out.println(largestSquare);
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