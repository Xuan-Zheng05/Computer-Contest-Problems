import java.util.*;
import java.io.*;

public class BattlePositions {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int firstStation, lastStation, troops;
        int lessStation = 0;

        int k = readInt();
        int n = readInt();
        int j = readInt();

        int[] stations = new int[k];
        for (int i = 0; i < j; i++) {
            firstStation = readInt();
            lastStation = readInt();
            troops = readInt();

            for (int m = firstStation - 1; m < lastStation; m++) {
                stations[m] += troops;
            }
        }
        for (int i = 0; i < k; i++) {
            if (stations[i] < n) {
                lessStation++;
            }
        }
        System.out.println(lessStation);
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