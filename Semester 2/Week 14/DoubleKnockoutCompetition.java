import java.util.*;
import java.io.*;

public class DoubleKnockoutCompetition {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        for (int i = 0; i < n; i++) {
            int teams = readInt();
            boolean flag = true;
            int zeroLosses = teams;
            int oneLosses = zeroLosses / 2;
            int round = 1;
            while (flag) {

                oneLosses += zeroLosses / 2;
                if (oneLosses == 1 && zeroLosses == 1) {
                    System.out.println("Round 3: 0 undefeated, 1 one-loss, 1 eliminated");

                }
                round++;
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
