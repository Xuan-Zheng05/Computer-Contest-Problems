import java.util.*;
import java.io.*;

public class Geppetto {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int different = 0;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = i + 1;
        }
        int m = readInt();
        int[] m1 = new int[m];
        int[] m2 = new int[m];
        for (int i = 0; i < m; i++) {
            m1[i] = readInt();
            m2[i] = readInt();
        }
        boolean[] used = new boolean[a.length];
        List<Integer> perm = new ArrayList<>();
        fun(a, used, perm, m1, m2);
        System.out.println(different);
    }

    static void fun(int[] a, boolean[] used, List<Integer> perm, int[] m1, int[] m2) {
        if (perm.size() == a.length) {
            boolean flag = true;
            for (int i = 0; i < m1.length; i++) {
                if (perm.contains(m1[i]) && perm.contains(m2[i])) {
                    if (perm.contains(m1[i])) {
                        System.out.println("kk");
                    }
                    if (perm.contains(m2[i])) {
                        System.out.println("kkk");
                    }
                    flag = false;
                }
            }
            if (flag) {
                different++;
            }
            return;
        }

        for (int i = 0; i < a.length; i++) {

            if (!used[i]) {
                perm.add(a[i]);
                used[i] = true;

                fun(a, used, perm, m1, m2);
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
