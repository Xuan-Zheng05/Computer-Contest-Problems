import java.util.*;
import java.io.*;

public class IOI101 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] line = readLine().toCharArray();

        for (int i = 0; i < line.length; i++) {
            switch (line[i]) {
                case '0':
                    line[i] = 'O';
                    break;
                case '1':
                    line[i] = 'l';
                    break;
                case '3':
                    line[i] = 'E';
                    break;
                case '4':
                    line[i] = 'A';
                    break;
                case '5':
                    line[i] = 'S';
                    break;
                case '6':
                    line[i] = 'G';
                    break;
                case '8':
                    line[i] = 'B';
                    break;
                case '9':
                    line[i] = 'g';
                    break;
            }
            System.out.print(line[i]);
        }
        System.out.println();
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
