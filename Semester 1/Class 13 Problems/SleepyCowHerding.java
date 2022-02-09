import java.util.*;
import java.io.*;

public class SleepyCowHerding {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int cow1 = readInt();
        int cow2 = readInt();
        int cow3 = readInt();

        int[] cows = { cow1, cow2, cow3 };
        Arrays.sort(cows);

        if (cows[2] == cows[0] + 2) {
            System.out.println(0);
        } else if (cows[0] + 2 == cows[1] || cows[1] + 2 == cows[2]) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if (cows[2] - cows[1] > cows[1] - cows[0]) {
            System.out.println(cows[2] - cows[1] - 1);
        } else {
            System.out.println(cows[1] - cows[0] - 1);
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