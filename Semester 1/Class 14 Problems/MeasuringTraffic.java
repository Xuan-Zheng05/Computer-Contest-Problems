import java.util.*;
import java.io.*;

public class MeasuringTraffic {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] lower = new int[100];
        int[] upper = new int[100];
        String[] command = new String[100];

        int n = readInt();
        for (int i = 0; i < n; i++) {
            command[i] = next();
            lower[i] = readInt();
            upper[i] = readInt();
        }

        int lowerBefore = -9999999, upperBefore = 9999999;
        for (int i = n - 1; i >= 0; i--) {
            if (command[i].equals("none")) {
                lowerBefore = Math.max(lowerBefore, lower[i]);
                upperBefore = Math.min(upperBefore, upper[i]);
            } else if (command[i].equals("on")) {
                lowerBefore += lower[i];
                upperBefore += upper[i];
            } else if (command[i].equals("on")) {
                lowerBefore -= upper[i];
                upperBefore -= lower[i];
                lowerBefore = Math.max(0, lowerBefore);
            }
        }
        System.out.println(lowerBefore + " " + upperBefore);

        int lowerAfter = -9999999, upperAfter = 9999999;
        for (int i = 0; i < n; i++) {
            if (command[i].equals("none")) {
                lowerAfter = Math.max(lowerAfter, lower[i]);
                upperAfter = Math.min(upperAfter, upper[i]);
            } else if (command[i].equals("on")) {
                lowerAfter += lower[i];
                upperAfter += upper[i];
            } else if (command[i].equals("off")) {
                lowerAfter -= upper[i];
                upperAfter -= lower[i];
                lowerAfter = Math.max(0, lowerAfter);
            }
        }
        System.out.println(lowerAfter + " " + upperAfter);
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