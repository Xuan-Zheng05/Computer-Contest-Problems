import java.util.*;
import java.io.*;

public class FlipTheSwitches {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] num = new int[n];
        String temp = readLine();
        for (int i = 0; i < n; i++) {
            num[i] = Character.getNumericValue(temp.charAt(i));
        }
        int counter = 0;
        int flips = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (num[i] == 0) {
                if (counter % 2 != 0) {
                    counter++;
                    flips++;
                }
            } else {
                if (counter % 2 == 0) {
                    counter++;
                    flips++;
                }
            }
        }
        System.out.println(flips);
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
