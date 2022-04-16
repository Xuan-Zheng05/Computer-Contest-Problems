import java.util.*;
import java.io.*;

public class ChikaNumbers {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt();
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                grid[i][j] = readInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[n][m] == 0) {

                }
            }
        }
        boolean possible = true;
        if (possible) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.println(grid[i][j]);
                }
            }
        } else {
            System.out.println(-1);
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
