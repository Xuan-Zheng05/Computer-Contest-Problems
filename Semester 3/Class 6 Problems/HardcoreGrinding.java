import java.util.*;
import java.io.*;

public class HardcoreGrinding {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = readInt(), mv = 10000000, dif[] = new int[mv + 2];
        for (int i = 1; i <= N; i++) {
            int x = readInt(), y = readInt();
            dif[x]++;
            dif[y]--;
        }
        int max = 0;
        for (int i = 1; i <= mv; i++) {
            dif[i] += dif[i - 1];
            if (dif[i] > max)
                max = dif[i];
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