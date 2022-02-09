import java.util.*;
import java.io.*;

public class Herdle {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] freqCorrect = new int[26];
        int[] freqGuess = new int[26];

        String correct = readLine() + readLine() + readLine();
        String guess = readLine() + readLine() + readLine();
        int green = 0;
        for (int j = 0; j < 9; j++) {
            if (correct.charAt(j) == guess.charAt(j)) {
                green++;
            }
            freqCorrect[correct.charAt(j) - 'A']++;
            freqGuess[guess.charAt(j) - 'A']++;
        }
        int yellow = 0;
        for (int j = 0; j < 26; j++) {
            yellow += Math.min(freqCorrect[j], freqGuess[j]);
        }
        yellow -= green;
        System.out.println(green);
        System.out.println(yellow);
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