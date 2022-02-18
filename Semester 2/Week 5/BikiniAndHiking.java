import java.util.*;
import java.io.*;

public class BikiniAndHiking {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), speed = readInt();
        char[] road = readLine().toCharArray();

        int sections = 0;
        for (int i = 0; i < road.length; i++) {
            if (speed == 0 && road[i] != 'D') {
                sections++;
            } else {
                if (road[i] == 'D') {
                    speed++;
                } else if (road[i] == 'U') {
                    speed--;
                    if (speed == 0) {
                        sections++;
                    }
                }
            }
        }
        System.out.println(sections);
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