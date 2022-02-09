import java.util.*;
import java.io.*;

public class AlicesShoppingTrip {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int distance = 0;
        int numShops = 0;

        int t = readInt();
        int n = readInt();
        Integer[] shops = new Integer[n];

        for (int i = 0; i < n; i++) {
            shops[i] = readInt();
        }

        Arrays.sort(shops, Comparator.comparingInt(Math::abs));

        distance += Math.abs(shops[0]);
        t -= Math.abs(distance);
        numShops++;

        for (int i = 0; t > 0; i++) {
            distance = shops[i + 1] - shops[i];
            if (t >= Math.abs(distance)) {
                numShops++;
            }
            t -= Math.abs(distance);
        }
        System.out.println(numShops);
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