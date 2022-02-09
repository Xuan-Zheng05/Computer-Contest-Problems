import java.util.*;
import java.io.*;

public class CrossSpiral {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int boxWidth = readInt();
        int boxHeight = readInt();
        int smallWidth = readInt();
        int smallHeight = readInt();

        int[][] array = new int[boxHeight + 2][boxWidth + 2];
        // outline
        for (int i = 0; i < boxWidth + 2; i++) {
            array[0][i] = 1;
        }
        for (int i = 0; i < boxHeight + 2; i++) {
            array[i][0] = 1;
            array[i][boxWidth + 1] = 1;
        }
        for (int i = 0; i < boxWidth + 2; i++) {
            array[boxHeight + 1][i] = 1;
        }
        // top left corner
        for (int i = 1; i < smallHeight + 2; i++) {
            for (int j = 1; j < smallWidth + 2; j++) {
                array[i][j] = 1;
            }
        }
        // top right corner
        for (int i = 0; i < smallHeight + 1; i++) {
            for (int j = boxWidth - smallWidth + 1; j < boxWidth + 1; j++) {
                array[i][j] = 1;
            }
        }
        // bottom left corner
        for (int i = boxHeight - 1; i < boxHeight + 1; i++) {
            for (int j = 0; j < boxWidth + 1; j++) {
                array[i][j] = 1;
            }
        }
        // bottom right corner
        for (int i = boxHeight - 1; i < boxHeight + 1; i++) {
            for (int j = boxWidth - smallWidth + 1; j < boxWidth + 1; j++) {
                array[i][j] = 1;
            }
        }

    }

    static int nextMove(int x, int y) {

        return 0;
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