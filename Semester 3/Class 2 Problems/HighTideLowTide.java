import java.util.*;
import java.io.*;

public class HighTideLowTide {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        ArrayList<Integer> tides = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            tides.add(readInt());
        }
        Collections.sort(tides);
        int highNum = n / 2;
        int lowNum = n - highNum;
        int low = lowNum - 1;
        int high = lowNum;
        int counter = n;
        while (counter > 0) {
            if (low > -1) {
                System.out.print(tides.get(low) + " ");
                low--;
                counter--;
            }
            if (high < n) {
                System.out.print(tides.get(high) + " ");
                high++;
                counter--;

            }
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