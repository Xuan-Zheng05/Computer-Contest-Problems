import java.util.*;
import java.io.*;

public class TakeANumber {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int late = 0, inLine = 0, nextNum = n;
        String action = readLine();
        while (!action.equals("EOF")) {
            if (action.equals("TAKE")) {
                nextNum++;
                if (nextNum == 1000) {
                    nextNum = 1;
                }
                late++;
                inLine++;
            } else if (action.equals("SERVE")) {
                inLine--;
            } else if (action.equals("CLOSE")) {
                System.out.println("" + late + " " + inLine + " " + nextNum);
                late = 0;
                inLine = 0;
            } else {
                break;
            }
            action = readLine();
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
