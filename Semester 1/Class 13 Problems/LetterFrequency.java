import java.util.*;
import java.io.*;

public class LetterFrequency {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        String input = readLine();
        input = input.replaceAll("[^a-zA-Z]", "");
        String[] sentence = input.split("");

        int n = readInt();
        for (int i = 0; i < n; i++) {

            int total = 0;

            int L = readInt();
            int R = readInt();
            char letter = readCharacter();

            if (R > sentence.length) {
                R = sentence.length;
            }

            for (int j = L - 1; j < R; j++) {

                for (int k = 0; k < sentence[j].length(); k++) {

                    if (sentence[j].charAt(k) == letter) {
                        total++;
                    }
                }
            }
            System.out.println(total);
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