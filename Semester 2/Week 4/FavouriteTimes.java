import java.util.*;
import java.io.*;

public class FavouriteTimes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] times = { 1234, 111, 123, 135, 147, 159, 210, 222, 234, 246, 258, 321, 333, 345, 357, 420, 432, 444,
                456, 531, 543, 555, 630, 642, 654, 741, 753, 840, 852, 951, 1111 };
        int d = readInt();
        int sequences = 0;

        sequences += times.length * (d / 720);
        d = d % 720;

        int loopTimes = d;
        int time = 1200;
        for (int i = 0; i <= loopTimes; i++) {
            for (int j = 0; j < times.length; j++) {
                if (time == times[j]) {
                    sequences++;
                    break;
                }
            }
            if (time == 1259) {
                time = 100;
            } else if (time == 1059) {
                time = 1100;
            } else if (time == 159) {
                time = 200;
            } else if (time == 259) {
                time = 300;
            } else if (time == 359) {
                time = 400;
            } else if (time == 459) {
                time = 500;
            } else if (time == 559) {
                time = 600;
            } else if (time == 659) {
                time = 700;
            } else if (time == 759) {
                time = 800;
            } else if (time == 859) {
                time = 900;
            } else if (time == 959) {
                time = 1000;
            } else {
                time++;
            }

        }
        System.out.println(sequences);
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