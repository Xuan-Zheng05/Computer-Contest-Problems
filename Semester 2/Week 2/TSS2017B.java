import java.util.*;
import java.io.*;

public class TSS2017B {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x, y, destroyed = 0;
        double scenario;
        int n = readInt(), q = readInt();
        double[] distance = new double[n];
        for (int i = 0; i < n; i++) {
            x = readInt();
            y = readInt();
            distance[i] = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        }
        Arrays.sort(distance);
        for (int i = 0; i < q; i++) {
            scenario = readDouble();
            destroyed = Arrays.binarySearch(distance, scenario);
            if (destroyed < 0) {
                destroyed = destroyed * -1 - 1;
            } else {
                while (destroyed + 1 < n) {
                    if (distance[destroyed + 1] == distance[destroyed]) {
                        destroyed++;
                    } else {
                        break;
                    }
                }
                destroyed++;
            }
            System.out.println(destroyed);
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