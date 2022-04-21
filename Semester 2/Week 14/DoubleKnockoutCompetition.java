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
            System.out.println(teams);
            boolean flag = true;
            int zeroLosses = teams;
            int oneLosses = 0;
            int round = 0;
            int eliminated = 0;
            System.out.println(
                    "Round " + round + ": " + zeroLosses + " undefeated, " + oneLosses + " one-loss, " + eliminated
                            + " eliminated");
            round++;
            while (flag) {
                eliminated = oneLosses / 2;
                oneLosses /= 2;
                oneLosses += zeroLosses / 2;
                zeroLosses /= 2;
                if (zeroLosses <= 0) {
                    zeroLosses = 1;

                }
                if (oneLosses == 1 && zeroLosses == 1) {
                    System.out.println("Round " + round + ": 1 undefeated, 1 one-loss, " + eliminated + " eliminated");
                    round++;
                    System.out.println("Round " + round + ": 0 undefeated, 2 one-loss, 0 eliminated");
                    round++;
                    System.out.println("Round " + round + ": 0 undefeated, 1 one-loss, 1 eliminated");
                    System.out.println("There are " + round + " rounds.");
                    break;

                } else {
                    System.out.println("Round " + round + ": " + zeroLosses + " undefeated, " + oneLosses
                            + " one-loss, " + eliminated
                            + " eliminated");
                }
                round++;
            }
            System.out.println();
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
