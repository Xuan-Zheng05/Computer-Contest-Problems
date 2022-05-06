import java.util.*;
import java.io.*;

public class Alchemy {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int n, a[];
    static Map<Integer, List<Integer>> map;

    public static void main(String[] args) throws IOException {

        n = readInt();
        a = new int[n + 1];
        map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            a[i] = readInt();
        }
        for (int k = readInt(); k > 0; k--) {
            int t = readInt();
            map.put(t, new ArrayList<>());
            for (int m = readInt(); m > 0; m--) {
                map.get(t).add(readInt());
            }
        }
        int ans = 0;
        while (fun(n)) {
            ans++;
        }
        System.out.println(ans);
    }

    static boolean fun(int d) {
        if (a[d] > 0) {
            a[d]--;
            return true;
        }
        if (a[d] == 0 && !map.containsKey(d)) {
            return false;
        }
        for (int x : map.get(d)) {
            if (!fun(x)) {
                return false;
            }
        }
        return true;
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
