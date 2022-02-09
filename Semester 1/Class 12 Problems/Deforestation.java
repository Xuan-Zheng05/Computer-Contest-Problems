import java.util.*;
import java.io.*;

public class Deforestation {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();

        int[] trees = new int[n];
        int[] totalTrees = new int[n];

        trees[0] = readInt();
        totalTrees[0] = trees[0];

        for (int i = 1; i < n; i++) {
            trees[i] = readInt();
            totalTrees[i] = totalTrees[i - 1] + trees[i];
        }

        int queries = readInt();

        for (int i = 0; i < queries; i++) {
            int a = readInt();
            int b = readInt();

            int totalMass;
            if (a > 0) {
                totalMass = totalTrees[b] - totalTrees[a - 1];
            } else {
                totalMass = totalTrees[b];
            }
            System.out.println(totalMass);
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