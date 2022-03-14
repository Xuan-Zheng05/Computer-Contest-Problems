import java.util.*;
import java.io.*;

public class NormalProbabilities {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        double probability = 1;

        int n = readInt();
        for (int i = 0; i < n; i++) {
            char event = readCharacter();

            if (event == 'B') {
                probability = probability * 0.8;
            } else if (event == 'C') {
                probability = probability * 0.6;
            } else if (event == 'D') {
                probability = probability * 0.4;
            } else if (event == 'E') {
                probability = probability * 0.2;
            }
        }
        System.out.println(probability);
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
