import java.util.*;
import java.io.*;

public class PopularBread {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt();

        int l = readInt(), r = readInt();
        if (l > r) {
            int temp = r;
            r = l;
            l = temp;
        }
        for (int i = 1; i < m; i++) {
            int tempL, tempR;
            int temp1 = readInt(), temp2 = readInt();
            if (temp1 < temp2) {
                tempL = temp1;
                tempR = temp2;
            } else {
                tempR = temp1;
                tempL = temp2;
            }
            if (tempL > l) {
                l = tempL;
            }
            if (tempR < r) {
                r = tempR;
            }
        }
        if (r - l + 1 < 0) {
            System.out.println(0);
        } else {
            System.out.println(r - l + 1);
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
