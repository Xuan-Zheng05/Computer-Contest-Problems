import java.util.*;
import java.io.*;

public class AlicesShoppingTrip {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt(), n = readInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
        }
        Arrays.sort(arr, Comparator.comparingInt(Math::abs));

        int distance = 0;
        int numShops = 0;
        distance += Math.abs(arr[0]);
        t -= Math.abs(distance);
        numShops++;

        for (int i = 0; t > 0; i++) {
            distance = arr[i + 1] - arr[i];
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
