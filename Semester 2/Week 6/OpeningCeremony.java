import java.util.*;
import java.io.*;

public class OpeningCeremony {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int f = readInt(), m = readInt(), b = readInt();

        int cost = 0;
        int tf, tm, tb;
        tf = readInt();
        tm = readInt();
        tb = readInt();
        cost += f * tf;
        cost += m * tm;
        cost += b * tb;
        System.out.println((tf + tm + tb) + " " + cost);
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