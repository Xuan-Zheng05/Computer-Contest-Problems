import java.util.*;
import java.io.*;

public class LeastWord {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), l = readInt();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            String newWord = "";
            words[i] = readLine();
            for (int j = l - 1; j >= 0; j--) {
                newWord += words[i].charAt(j);
            }
            if (words[i].compareTo(newWord) > 0) {
                words[i] = newWord;
            }
        }
        Arrays.sort(words);
        for (int i = 0; i < n; i++) {
            System.out.print(words[i]);
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