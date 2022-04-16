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
        boolean possible = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 0) {
                    if (i > 0 && j > 0) {
                        grid[i][j] = Math.max(grid[i - 1][j], grid[i][j - 1]) + 1;
                    } else if (i > 0) {
                        grid[i][j] = grid[i - 1][j] + 1;
                    } else if (j > 0) {
                        grid[i][j] = grid[i][j - 1] + 1;
                    } else {
                        grid[i][j] = 1;
                    }

                    if (i + 1 < n && j + 1 < m) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i + 1][j] != 0) {
                            possible = false;
                            break;
                        }
                        if (grid[i][j] > grid[i][j + 1] && grid[i][j + 1] != 0) {
                            possible = false;
                            break;
                        }
                    } else if (i + 1 < n) {
                        if (grid[i][j] > grid[i + 1][j] && grid[i + 1][j] != 0) {
                            possible = false;
                            break;
                        }
                    } else if (j + 1 < m) {
                        if (grid[i][j] > grid[i][j + 1] && grid[i][j + 1] != 0) {
                            possible = false;
                            break;
                        }
                    }
                }
            }
        }
        if (possible) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    System.out.print(grid[i][j] + " ");
                }
                System.out.println();
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
