import java.util.*;
import java.io.*;

public class WordScrambler {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String word = readLine();
        String[] sortedWord = word.split("");
        Arrays.sort(sortedWord);
        word = "";
        for (int i = 0; i < sortedWord.length; i++) {
            word += sortedWord[i];
        }
        printDistinctPermutn(word, "");

    }

    static void printDistinctPermutn(String str, String ans) {

        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }

        boolean alpha[] = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String ros = str.substring(0, i) + str.substring(i + 1);

            if (alpha[ch - 'a'] == false) {
                printDistinctPermutn(ros, ans + ch);
            }
            alpha[ch - 'a'] = true;
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