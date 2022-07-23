import java.util.*;
import java.io.*;

public class VoronoiVillages {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        double[] villages = new double[n];
        for (int i = 0; i < n; i++) {
            villages[i] = readInt();
        }
        Arrays.sort(villages);
        ArrayList<Double> distance = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            distance.add((villages[i + 1] - villages[i]) / 2 + (villages[i] - villages[i - 1]) / 2);
        }

        Collections.sort(distance);
        System.out.println(distance.get(0));
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
