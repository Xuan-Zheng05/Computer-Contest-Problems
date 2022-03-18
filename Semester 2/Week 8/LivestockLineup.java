import java.util.*;
import java.io.*;

public class LivestockLineup {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n;
    static String x[], y[];

    public static void main(String[] args) throws IOException {

        String name[] = { "Bessie", "Buttercup", "Belinda", "Beatrice", "Bella", "Blue", "Betsy", "Sue" };
        Arrays.sort(name);
        List<String> perm = new ArrayList<>();
        boolean used[] = new boolean[name.length];
        n = readInt();
        x = new String[n];
        y = new String[n];
        for (int i = 0; i < n; i++) {
            x[i] = next();
            for (int j = 0; j < 5; j++)
                y[i] = next();
        }
        getPermutation(name, used, perm);
    }

    static void getPermutation(String[] a, boolean[] used, List<String> perm) {
        if (perm.size() == a.length) {
            boolean flag = true;
            for (int i = 0; i < n; i++) {
                int px = perm.indexOf(x[i]), py = perm.indexOf(y[i]);
                if (Math.abs(px - py) != 1) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                for (String name : perm)
                    System.out.println(name);
                System.exit(0);
            }
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm.add(a[i]);
                getPermutation(a, used, perm);
                used[i] = false;
                perm.remove(perm.size() - 1);
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
