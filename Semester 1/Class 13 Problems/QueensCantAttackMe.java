import java.util.*;
import java.io.*;

public class QueensCantAttackMe {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = readInt();
        int m = readInt();

        int[][] board = new int[n][n];
        int x, y;

        for (int i = 0; i < m; i++) {
            String[] t = readLine().split(" ");

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x++;
                y++;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x++;
                y--;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x--;
                y++;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x--;
                y--;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x--;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                y--;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                x++;
            }

            x = Integer.parseInt(t[0]);
            y = Integer.parseInt(t[1]);
            while (x <= n && y <= n && x > 0 && y > 0) {
                board[x - 1][y - 1] = 1;
                y++;
            }
        }
        int cells = 0;
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                if (board[i][k] == 0) {
                    cells++;
                }
            }
        }
        System.out.println(cells);
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