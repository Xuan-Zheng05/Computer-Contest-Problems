import java.util.*;
import java.io.*;

public class MimiAndBinary {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] temp = readLine().split("");
        int[] binary = new int[temp.length];
        ArrayList<Integer> zeroList = new ArrayList<Integer>();
        ArrayList<Integer> onesList = new ArrayList<Integer>();

        for (int i = 0; i < temp.length; i++) {
            binary[i] = Integer.parseInt(temp[i]);
        }

        for (int i = 0; i < binary.length; i++) {
            int start = 0;
            if (binary[i] == 0) {
                start = i;
                while (binary[i] == 0) {
                    if (i++ < binary.length) {
                        i++;
                    }
                }
            }
            zeroList.add(start);
            zeroList.add(i - 1);
        }
        for (int i = 0; i < binary.length; i++) {
            int start = 0;
            if (binary[i] == 1) {
                start = i;
                while (binary[i] == 1) {
                    if (i++ < binary.length) {
                        i++;
                    }
                }
            }
            onesList.add(start);
            onesList.add(i - 1);
        }

        int q = readInt();
        for (int i = 0; i < q; i++) {
            int index = readInt(), occurences = readInt(), number = readInt();

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