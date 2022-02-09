import java.util.*;
import java.io.*;

public class DoTheShuffle {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] playlist = { "A", "B", "C", "D", "E" };
        int b, n;
        do {
            String temp;
            b = readInt();
            n = readInt();
            if (b == 1) {
                for (int j = 0; j < n; j++) {
                    temp = playlist[0];
                    playlist[0] = playlist[1];
                    playlist[1] = playlist[2];
                    playlist[2] = playlist[3];
                    playlist[3] = playlist[4];
                    playlist[4] = temp;
                }
            }
            if (b == 2) {
                for (int j = 0; j < n; j++) {
                    temp = playlist[4];
                    playlist[4] = playlist[3];
                    playlist[3] = playlist[2];
                    playlist[2] = playlist[1];
                    playlist[1] = playlist[0];
                    playlist[0] = temp;
                }
            }
            if (b == 3) {
                if (n % 2 == 1) {
                    temp = playlist[0];
                    playlist[0] = playlist[1];
                    playlist[1] = temp;
                }
            }
            if (b == 4) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(playlist[k] + " ");
                }
                System.exit(0);
            }
        } while (b != 4);
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