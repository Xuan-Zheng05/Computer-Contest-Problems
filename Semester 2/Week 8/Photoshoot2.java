import java.util.*;
import java.io.*;

public class Photoshoot2 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        for (int i = 0; i < n; i++) {
            b[i] = readInt();
        }
        int answer = 0;
        boolean[] moved = new boolean[n + 1];
        int k = 0;
        for (int j = 0; j < n; j++) {
            while (moved[a[k]]) {
                k++;
            }
            if (b[j] == a[k]) {
                k++;
            } else {
                answer++;
                moved[b[j]] = true;
            }
        }
        System.out.println(answer);
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