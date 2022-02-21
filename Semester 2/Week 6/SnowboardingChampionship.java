import java.util.*;
import java.io.*;

public class SnowboardingChampionship {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), a = readInt(), b = readInt();
        int aTime = 0, bTime = 0;
        for (int i = 0; i < n; i++) {
            if (readInt() < a) {
                aTime++;
            } else {
                aTime += 3;
            }
            if (readInt() < b) {
                bTime++;
            } else {
                bTime += 3;
            }
        }
        if (aTime < bTime) {
            System.out.println("Andrew wins!");
        } else if (bTime < aTime) {
            System.out.println("Tommy wins!");
        } else {
            System.out.println("Tie!");
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