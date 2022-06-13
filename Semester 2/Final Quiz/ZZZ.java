import java.util.*;
import java.io.*;

public class ZZZ {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] sentence = readLine().toCharArray();
        int z = 0;
        for (int i = 0; i < sentence.length; i++) {
            if (sentence[i] == 'z' || sentence[i] == 'Z') {
                z++;
            }
        }
        if (z >= 3) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
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
