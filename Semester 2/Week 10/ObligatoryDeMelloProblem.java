import java.util.*;
import java.io.*;

public class ObligatoryDeMelloProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] w = readLine().split("");
        int vowels = 0;
        for (int i = 0; i < w.length; i++) {
            if (w[i].equals("a")) {
                vowels++;
            } else if (w[i].equals("e")) {
                vowels++;
            } else if (w[i].equals("i")) {
                vowels++;
            } else if (w[i].equals("o")) {
                vowels++;
            } else if (w[i].equals("u")) {
                vowels++;
            } else if (w[i].equals("y")) {
                vowels++;
            }
        }
        if (vowels > 1) {
            System.out.println("good");
        } else {
            System.out.println("bad");
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
