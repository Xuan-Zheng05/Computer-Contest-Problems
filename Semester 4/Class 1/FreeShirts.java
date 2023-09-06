import java.util.*;
import java.io.*;

public class FreeShirts {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 10; i++) {
            int n = readInt(), m = readInt(), d = readInt();
            int shirts = n, totalShirts = n, laundry = 0;
            int[] comp = new int[m];
            for (int j = 0; j < m; j++) {
                comp[j] = readInt();
            }
            for (int j = 1; j <= d; j++) {
                if (shirts == 0) {
                    laundry++;
                    shirts = totalShirts;
                }
                for (int k = 0; k < m; k++) {
                    if (j == comp[k]) {
                        shirts++;
                        totalShirts++;
                    }
                }
                shirts--;
            }
            System.out.println(laundry);
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