import java.util.*;
import java.io.*;

public class HomeRow {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        String firstLine[] = readLine().split("");
        String secondLine[] = readLine().split("");

        int placeSame = -1;
        int strokes;

        for (int i = 0; i < firstLine.length; i++) {

            if (i >= secondLine.length) {
                break;
            } else {
                if (firstLine[i].equals(secondLine[i])) {
                    placeSame = i;
                    continue;
                } else {

                    break;
                }
            }
        }

        strokes = firstLine.length - placeSame - 1;
        strokes += secondLine.length - placeSame - 1;

        System.out.println(strokes);
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
