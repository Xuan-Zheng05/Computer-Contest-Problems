import java.util.*;
import java.io.*;

public class DaisyChains {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();

        int[] petals = new int[n];
        for (int i = 0; i < n; ++i) {
            petals[i] = readInt();
        }

        int photos = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i; j < n; ++j) {
                int totalPetals = 0;
                for (int k = i; k <= j; ++k) {
                    totalPetals += petals[k];
                }

                boolean average = false;
                for (int k = i; k <= j; ++k) {
                    if (petals[k] * (j - i + 1) == totalPetals) {
                        average = true;
                    }
                }

                if (average) {
                    photos++;
                }
            }
        }
        System.out.println(photos);
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