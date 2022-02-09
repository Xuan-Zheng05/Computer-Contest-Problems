import java.util.*;
import java.io.*;

public class Fix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] word = new String[3];
        int n = readInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++)
                word[j] = readLine();
            if (word[0].startsWith(word[1]) ||
                    word[0].startsWith(word[2]) ||
                    word[1].startsWith(word[2]) ||
                    word[1].startsWith(word[0]) ||
                    word[2].startsWith(word[0]) ||
                    word[2].startsWith(word[1]) ||
                    word[0].endsWith(word[1]) ||
                    word[0].endsWith(word[2]) ||
                    word[1].endsWith(word[2]) ||
                    word[1].endsWith(word[0]) ||
                    word[2].endsWith(word[0]) ||
                    word[2].endsWith(word[1])) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
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