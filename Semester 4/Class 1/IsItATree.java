import java.util.*;
import java.io.*;

public class IsItATree {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[][] matrix = new int[4][4];
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            int row = 0;
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = readInt();
                sum += matrix[i][j];
                row += matrix[i][j];
            }
            if (row == 0) {
                System.out.println("No");
                return;
            }
        }
        if (sum == 6) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
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