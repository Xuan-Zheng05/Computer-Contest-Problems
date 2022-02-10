import java.util.*;
import java.io.*;

public class TandemBicycles2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int question = readInt();
        int n = readInt();

        int[] Dmojistan = new int[n];
        int[] Pegland = new int[n];
        for (int i = 0; i < n; i++) {
            Dmojistan[i] = readInt();
        }
        for (int i = 0; i < n; i++) {
            Pegland[i] = readInt();
        }
        Arrays.sort(Dmojistan);
        Arrays.sort(Pegland);

        int finalSpeed = 0;
        if (question == 1) {
            for (int i = 0; i < n; i++) {
                finalSpeed = Math.max(Dmojistam[i], Pegland[i]);
            }
        } else {
            for (int i = 0; i < n; i++) {

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