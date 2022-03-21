import java.util.*;
import java.io.*;

public class CombinationExample {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;

    public static void main(String[] args) throws IOException {
        n = readInt();

        List<Integer> comb = new ArrayList<>();
        fun(1, n, comb);
        System.out.println(comb);
    }

    static void fun(int cur, int n, List<Integer> comb) {

        if (cur > n) {
            if (comb.isEmpty()) {
                return;
            }
            System.out.println(comb);
            return;
        }
        fun(cur + 1, n, comb);
        comb.add(cur);
        fun(cur + 1, n, comb);
        comb.remove(comb.size() - 1);
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