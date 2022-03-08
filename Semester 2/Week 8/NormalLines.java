import java.util.*;
import java.io.*;

public class NormalLines {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x1 = readInt(), y1 = readInt();
        int x2 = readInt(), y2 = readInt();

        boolean xAxis = false, yAxis = false;

        if (y1 == y2) {
            xAxis = true;
        }

        if (x1 == x2) {
            yAxis = true;
        }

        if (xAxis && yAxis) {
            System.out.println("neither");
        } else if (xAxis) {
            System.out.println("x-axis");
        } else if (yAxis) {
            System.out.println("y-axis");
        } else {
            System.out.println("neither");
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