import java.util.*;
import java.io.*;

public class IntertwinedStrings {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        fun(next(), next(), "");
        for (String x : set) {
            System.out.println(x);
        }
    }

    static void fun(String a, String b, String result) {
        if (a.isEmpty() && b.isEmpty()) {
            set.add(result);
            return;
        }
        if (!a.isEmpty()) {
            fun(a.substring(1), b, result + a.charAt(0));
        }
        if (!b.isEmpty()) {
            fun(a, b.substring(1), result + b.charAt(0));
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
