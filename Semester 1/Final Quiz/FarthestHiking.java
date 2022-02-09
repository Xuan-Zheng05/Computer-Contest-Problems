import java.util.*;
import java.io.*;

public class FarthestHiking {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int m = readInt(), n = readInt(), u = readInt(), f = readInt(), d = readInt();
        char[] hill = readLine().toCharArray();
        int longest = 0;
        boolean done = true;
        while (done) {
            int distance = 0;
            for (int j = 0; j < n; j++) {
                if (hill[j] == 'u') {
                    distance += u + d;
                } else if (hill[j] == 'f') {
                    distance += f * 2;
                } else if (hill[j] == 'd') {
                    distance += d + u;
                }
                if (distance > m) {
                    longest = j;
                    done = false;
                    break;
                } else if (j == n - 1) {
                    longest = n;
                    done = false;
                    break;
                }
            }
        }
        if (longest < 0) {
            System.out.println(0);
        } else {
            System.out.println(longest);
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