import java.util.*;
import java.io.*;

public class GoodNumber {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long a = readLong(), ans = Long.MAX_VALUE;
        int k = readInt();
        for (int i = 1; i <= 9; i++) {
            for (int len = 1; len <= 18; len++) {
                long val = Long.parseLong(repeat(Integer.toString(i), len));
                if (val >= a)
                    ans = Math.min(ans, val);
            }
        }
        if (k > 0) {
            int len = Long.toString(ans).length();
            for (int i = 0; i <= 9; i++) {
                char d[] = repeat(Integer.toString(i), len).toCharArray();
                for (int j = 0; j <= 9; j++) {
                    if (i == j)
                        continue;
                    for (int l = 0; l < d.length; l++) {
                        d[l] = (char) ('0' + j);
                        long val = Long.parseLong(new String(d));
                        if (val >= a) {
                            ans = Math.min(ans, val);
                        }
                        d[l] = (char) ('0' + i);
                    }
                }
            }
        }
        System.out.println(ans);
    }

    static String repeat(String s, int n) {
        String ret = "";
        for (int i = 0; i < n; i++)
            ret += s;
        return ret;
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
