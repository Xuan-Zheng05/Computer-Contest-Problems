import java.util.*;
import java.io.*;

public class Perket {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int permutations = 0, k;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        k = readInt();
        int[] before = new int[k];
        int[] after = new int[k];
        for (int i = 0; i < k; i++) {
            before[i] = readInt();
            after[i] = readInt();
        }

        boolean[] used = new boolean[a.length];
        List<Integer> perm = new ArrayList<>();

        fun(a, used, perm, before, after);

        System.out.println(permutations);
    }

    static void fun(int[] a, boolean[] used, List<Integer> perm, int[] before, int[] after) {
        if (perm.size() == a.length) {
            boolean flag = true;

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < perm.size(); j++) {
                    if (perm.get(j) == before[i]) {
                        flag = false;
                    } else if (perm.get(j) == after[i]) {
                        flag = true;
                    }
                }
                if (!flag) {
                    break;
                }
            }
            if (flag) {
                permutations++;
            }
            return;
        }

        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                perm.add(a[i]);
                used[i] = true;

                fun(a, used, perm, before, after);
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