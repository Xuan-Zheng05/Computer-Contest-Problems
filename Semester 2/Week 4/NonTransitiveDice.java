import java.util.*;
import java.io.*;

public class NonTransitiveDice {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            int[] fDice = new int[4];
            int[] sDice = new int[4];
            for (int j = 0; j < 4; j++) {
                fDice[j] = readInt();
            }
            for (int j = 0; j < 4; j++) {
                sDice[j] = readInt();
            }
            Arrays.sort(fDice);
            Arrays.sort(sDice);

            String answer = "no";
            for (int a = 1; a <= 10; a++) {
                for (int b = 1; b <= 10; b++) {
                    for (int c = 1; c <= 10; c++) {
                        for (int d = 1; d <= 10; d++) {
                            int[] tDice = { a, b, c, d };
                            if (beats(fDice, sDice) && beats(sDice, tDice) && beats(tDice, fDice)) {
                                answer = "yes";
                            }
                            if (beats(sDice, fDice) && beats(fDice, tDice) && beats(tDice, sDice)) {
                                answer = "yes";
                            }
                        }
                    }
                }
            }
            System.out.println(answer);
        }
    }

    static boolean beats(int[] diceA, int[] diceB) {
        int diff = 0;
        for (int x : diceA) {
            for (int y : diceB) {
                diff += Integer.signum(x - y);
            }
        }
        return diff > 0;
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