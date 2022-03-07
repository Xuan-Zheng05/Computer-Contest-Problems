import java.util.*;
import java.io.*;

public class GoodGroupsFix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int violated = 0;
        HashMap<String, String> workTogether = new HashMap<String, String>();
        HashMap<String, String> cannotWork = new HashMap<String, String>();

        int x = readInt();
        for (int i = 0; i < x * 2; i += 2) {
            String a = next();
            String b = next();
            workTogether.put(a, b);
            workTogether.put(b, a);
        }

        int y = readInt();
        for (int i = 0; i < y * 2; i++) {
            String a = next();
            String b = next();
            cannotWork.put(a, b);
            cannotWork.put(b, a);
        }

        int g = readInt();

        for (int i = 0; i < g; i++) {
            String first = next(), second = next(), third = next();

            if (workTogether.containsValue(first + "," + second)) {

            }

        }

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
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
        return br.readLine();
    }

}