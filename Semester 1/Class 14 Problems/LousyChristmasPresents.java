import java.util.*;
import java.io.*;

public class LousyChristmasPresents {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> firstOccur = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> lastOccur = new HashMap<Integer, Integer>();

        int n = readInt(), m = readInt();
        int[] scarf = new int[n];

        for (int i = 0; i < n; i++) {
            scarf[i] = readInt();
            int colour = scarf[i];
            if (firstOccur.get(colour) == null) {
                firstOccur.put(colour, i);
                lastOccur.put(colour, i);
            } else {
                lastOccur.put(colour, i);
            }
        }

        int length = 0;
        for (int i = 0; i < m; i++) {
            int a = readInt(), b = readInt();
            if (firstOccur.get(a) == null || firstOccur.get(b) == null) {
                continue;
            }
            if (lastOccur.get(b) - firstOccur.get(a) + 1 > length) {
                length = lastOccur.get(b) - firstOccur.get(a) + 1;
            }
        }
        System.out.println(length);
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