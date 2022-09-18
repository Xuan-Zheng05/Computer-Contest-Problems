import java.util.*;
import java.io.*;

public class LetterFrequency {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] s = readLine().toCharArray();
        int n = s.length;
        int psa[][] = new int[n + 1][26];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 26; j++) {
                psa[i][j] = psa[i - 1][j];
            }
            if (s[i - 1] != ' ')
                psa[i][s[i - 1] - 'a']++;
        }
        for (int q = readInt(); q > 0; q--) {
            int l = readInt(), r = readInt(), c = readCharacter() - 'a';
            System.out.println(psa[r][c] - psa[l - 1][c]);
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