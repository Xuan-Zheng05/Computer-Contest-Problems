import java.util.*;
import java.io.*;

public class CounterfeitDetection {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] coins = readLine().toCharArray();
        int counterfeit = 0;
        boolean two = false;
        for (int i = 0; i < coins.length; i++) {
            if (coins[i] == '2') {
                two = true;
                counterfeit++;
            } else if (two && coins[i] == '5') {
                counterfeit--;
                two = false;
            } else {
                two = false;
            }
        }
        System.out.println(counterfeit);
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
