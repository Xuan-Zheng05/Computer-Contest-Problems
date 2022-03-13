import java.util.*;
import java.io.*;

public class NormalConversions {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int q = readInt();
        for (int i = 0; i < q; i++) {
            int firstBase = readInt();
            String strNum = next();
            int convertBase = readInt();

            strNum = baseConversion(strNum, firstBase, convertBase);
            System.out.println(strNum);
        }
    }

    public static String baseConversion(String number, int firstBase, int convertBase) {
        return Long.toString(
                Long.parseLong(number, firstBase), convertBase);
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
