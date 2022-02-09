import java.util.*;
import java.io.*;

public class Darcy_Liu {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] realUser = { 'D', 'A', 'R', 'C', 'Y', '_', 'L', 'I', 'U' };
        char[] userName = readLine().toCharArray();
        boolean real = true;
        int numUnder = 0;
        for (int i = 0; i < userName.length; i++) {
            if (userName[i] == '_' && userName[i + 1] != '_' && userName[i + 1] != 'L' && userName[i + 1] != 'l') {
                System.out.println("other user");
                System.exit(0);
            } else if (userName[i] == '_') {
                numUnder++;
            }
        }
        if (numUnder > 1) {
            System.out.println("fake");
            System.exit(0);
        }
        for (int i = 0; i < realUser.length; i++) {
            if (realUser[i] != userName[i] && realUser[i] + 32 != userName[i]) {
                real = false;
                break;
            }
        }

        if (real) {
            System.out.println("real");
        } else {
            System.out.println("other user");
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