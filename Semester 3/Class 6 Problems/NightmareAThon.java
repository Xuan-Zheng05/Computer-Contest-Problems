import java.util.*;
import java.io.*;

public class NightmareAThon {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt(), a[] = new int[n + 1];
        int[] pmx = new int[n + 1], pcnt = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            a[i] = readInt();
            if (a[i] > pmx[i - 1]) {
                pmx[i] = a[i];
                pcnt[i] = 1;
            } else if (a[i] == pmx[i - 1]) {
                pmx[i] = a[i];
                pcnt[i] = pcnt[i - 1] + 1;
            } else {
                pmx[i] = pmx[i - 1];
                pcnt[i] = pcnt[i - 1];
            }
        }
        int[] smx = new int[n + 2], scnt = new int[n + 2];
        for (int i = n; i >= 1; i--) {
            if (a[i] > smx[i + 1]) {
                smx[i] = a[i];
                scnt[i] = 1;
            } else if (a[i] == smx[i + 1]) {
                smx[i] = a[i];
                scnt[i] = scnt[i + 1] + 1;
            } else {
                smx[i] = smx[i + 1];
                scnt[i] = scnt[i + 1];
            }
        }
        for (int i = 1; i <= q; i++) {
            int x = readInt(), y = readInt();
            if (pmx[x - 1] > smx[y + 1]) {
                System.out.println(pmx[x - 1] + " " + pcnt[x - 1]);
            } else if (pmx[x - 1] < smx[y + 1]) {
                System.out.println(smx[y + 1] + " " + scnt[y + 1]);
            } else {
                System.out.println(pmx[x - 1] + " " + (pcnt[x - 1] + scnt[y + 1]));
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