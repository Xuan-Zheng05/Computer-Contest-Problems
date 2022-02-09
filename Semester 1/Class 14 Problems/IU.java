import java.util.*;
import java.io.*;

public class IU {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Long time = 0L;
        Long posCount = 0L;
        int n = readInt();
        char[] magnets = readLine().toCharArray();

        for (int i = 0; i < n * 2; i++) {
            if (magnets[i] == 'I') {
                time += Math.abs(posCount - i);
                posCount += 2;
            }
        }
        System.out.println(time);
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