import java.util.*;
import java.io.*;

public class PackingMicrowaves {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long n = readLong();

        long x = readLong(), y = readLong(), z = readLong();
        long rectangleArea = x * y * z;

        long a = readLong(), b = readLong(), c = readLong();
        long truckArea = a * b * c;

        if (rectangleArea > truckArea) {
            System.out.println("SCAMMED");
            System.exit(0);
        }
        double fit = truckArea / rectangleArea;

        long answer = (long) Math.ceil(n / fit);
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
