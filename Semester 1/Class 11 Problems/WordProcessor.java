import java.util.*;
import java.io.*;

public class WordProcessor {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int k = readInt();
        String[] sentence = readLine().split(" ");

        System.out.print(sentence[0]);
        int used = sentence[0].length();

        for (int i = 1; i < n; i++) {
            if (used + sentence[i].length() > k) {
                System.out.print("\n" + sentence[i]);
                used = sentence[i].length();
            } else {
                System.out.print(" ");
                System.out.print(sentence[i]);
                used = used + sentence[i].length();
            }
        }
        System.out.print("\n");
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