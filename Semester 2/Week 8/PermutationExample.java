import java.util.*;
import java.io.*;

public class PermutationExample {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] a = { 1, 2, 3, 4 };
        boolean[] used = new boolean[a.length];
        List<Integer> perm = new ArrayList<>();
        fun(a, used, perm);
        System.out.println();
    }

    static void fun(int[] a, boolean[] used, List<Integer> perm) {
        if (perm.size() == a.length) {
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                perm.add(a[i]);
                used[i] = true;

                fun(a, used, perm);
                perm.remove(perm.size() - 1);
                used[i] = false;
            }
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