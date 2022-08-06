import java.util.*;
import java.io.*;

public class SurmisingASprintersSpeed {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        Pair[] arr = new Pair[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(readInt(), readInt());
        }
        NameComparator namecmp = new NameComparator();
        Arrays.sort(arr, namecmp);

        double maxSpeed = 0;
        for (int i = 1; i < n; i++) {
            int time = Math.abs(arr[i].index - arr[i - 1].index);
            int distance = Math.abs(arr[i].value - arr[i - 1].value);
            double speed = (double) distance / (double) time;

            if (speed > maxSpeed) {
                maxSpeed = speed;
            }
        }
        System.out.println(maxSpeed);
    }

    static class Pair {
        Integer index, value;

        Pair(Integer v0, Integer i0) {
            index = v0;
            value = i0;
        }
    }

    static class NameComparator implements Comparator<Pair> {
        public int compare(Pair a, Pair b) {
            return a.index.compareTo(b.index);
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
