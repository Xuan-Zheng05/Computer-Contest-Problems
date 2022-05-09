import java.util.*;
import java.io.*;

public class AvocadoTrees {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt(), h = readInt();
        int[] heights = new int[n + 1];
        int[] yield = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            heights[i] = readInt();
            yield[i] = readInt();
        }
        int max = 0;
        for (int i = 0; i < q; i++) {
            int avocados = 0;
            int l = readInt(), r = readInt();
            boolean steal = true;
            for (int j = l; j <= r; j++) {
                if (heights[i] > h) {
                    steal = false;
                }
                avocados += yield[i];
            }
            if (steal) {
                max = Math.max(avocados, max);
            }
        }
        System.out.println(max);
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
