import java.util.*;
import java.io.*;

public class PackingMicrowaves {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long n = readLong();
        long x = readLong(), y = readLong(), z = readLong();
        long a = readLong(), b = readLong(), c = readLong();

        long placedA = a / x * b / y * c / z;
        long placedB = a / x * b / z * c / y;
        long placedC = b / x * a / y * c / z;
        long placedD = b / x * a / z * c / y;
        long placedE = c / x * a / y * b / z;
        long placedF = c / x * a / z * b / z;

        long bestPlace = 0;

        bestPlace = Math.max(placedA, placedB);
        bestPlace = Math.max(bestPlace, placedC);
        bestPlace = Math.max(bestPlace, placedD);
        bestPlace = Math.max(bestPlace, placedE);
        bestPlace = Math.max(bestPlace, placedF);

        if (bestPlace == 0) {
            System.out.println("SCAMMED");
            System.exit(0);
        }

        long answer = (long) Math.ceil((double) n / (double) bestPlace);
        System.out.println(answer);

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
