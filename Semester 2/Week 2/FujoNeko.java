import java.util.*;
import java.io.*;

public class FujoNeko {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int r = readInt(), c = readInt();
        int[] rows = new int[r];
        int[] columns = new int[c];
        char[] line = new char[c];
        for (int i = 0; i < r; i++) {
            line = readLine().toCharArray();
            for (int j = 0; j < c; j++) {
                if (line[j] == 'X') {
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }
        int q = readInt();
        for (int i = 0; i < q; i++) {
            int x = readInt(), y = readInt();
            if (columns[x - 1] == 1 || rows[y - 1] == 1) {
                System.out.println("Y");
            } else {
                System.out.println("N");
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