import java.util.*;
import java.io.*;

public class Square {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[][] square = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                square[i][j] = readInt();
            }
        }

        int largestSquare = 1;
        int times = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (square[i][j] != 0) {
                    if (i != 0 && j != 0) {
                        int up = square[i - 1][j];
                        int left = square[i][j - 1];
                        int diagonal = square[i - 1][j - 1];
                        square[i][j] = Math.min(up, Math.min(left, diagonal)) + 1;
                    }
                    if (square[i][j] > largestSquare) {
                        largestSquare = square[i][j];
                        times = 1;
                    } else if (square[i][j] == largestSquare) {
                        times++;
                    }
                }
            }
        }
        System.out.println(largestSquare * times);
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