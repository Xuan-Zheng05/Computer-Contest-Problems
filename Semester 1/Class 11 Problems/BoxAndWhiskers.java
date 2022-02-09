import java.util.*;
import java.io.*;

public class BoxAndWhiskers {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = readInt();
        }
        // Arrays.sort(data);

        double evenMedian = (Double.valueOf(data[n / 2 - 1]) + Double.valueOf(data[n / 2])) / 2;

        if (n % 2 == 0) {
            System.out.println(data[0] + " " + data[n - 1] + " " + data[n / 2 / 2] + " " + evenMedian + " "
                    + data[(n / 2 + n) / 2]);
        } else {
            System.out.println(data[0] + " " + data[n - 1] + " " + data[n / 2 / 2] + " " + data[n / 2] + " "
                    + data[(n / 2 + n) / 2]);
        }
    }

    static double average(ArrayList<Integer> list) {
        double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
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