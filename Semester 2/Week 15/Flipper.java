import java.util.*;
import java.io.*;

public class Flipper {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] line = readLine().toCharArray();

        int vertical = 0, horizontal = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] == 'H') {
                if (horizontal == 0) {
                    horizontal = 1;
                } else {
                    horizontal = 0;
                }
            } else {
                if (vertical == 0) {
                    vertical = 1;
                } else {
                    vertical = 0;
                }
            }
        }
        if (vertical == 0 && horizontal == 0) {
            System.out.println("1 2\n3 4");
        } else if (vertical == 1 && horizontal == 0) {
            System.out.println("2 1\n4 3");
        } else if (vertical == 0 && horizontal == 1) {
            System.out.println("3 4\n1 2");
        } else if (vertical == 1 && horizontal == 1) {
            System.out.println("4 3\n2 1");
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
