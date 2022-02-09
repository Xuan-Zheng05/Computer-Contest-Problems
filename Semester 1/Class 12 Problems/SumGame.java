import java.util.*;
import java.io.*;

public class SumGame {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int highestDay = 0;
        int n = readInt();
        int[] swift = new int[n];
        int[] sema = new int[n];

        int[] swiftTotal = new int[n];
        int[] semaTotal = new int[n];

        for (int i = 0; i < n; i++) {
            swift[i] = readInt();
        }
        for (int i = 0; i < n; i++) {
            sema[i] = readInt();
        }
        swiftTotal[0] = swift[0];
        semaTotal[0] = sema[0];

        if (swiftTotal[0] == semaTotal[0]) {
            highestDay = 1;
        }

        for (int i = 1; i < n; i++) {
            swiftTotal[i] = swiftTotal[i - 1] + swift[i];
            semaTotal[i] = semaTotal[i - 1] + sema[i];
            if (swiftTotal[i] == semaTotal[i]) {
                highestDay = i + 1;
            }
        }
        System.out.println(highestDay);
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