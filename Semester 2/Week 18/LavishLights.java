import java.io.*;
import java.util.*;

public class LavishLights {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    public static void main(String args[]) throws IOException {
        int n = readInt();
        int q = readInt();
        int bound = 0;
        int[] a = new int[n];
        long[] lcm = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = readInt();
        }
        lcm[0] = a[0];
        for (int i = 1; i < n; i++) {
            lcm[i] = LCM(a[i], lcm[i - 1]);
            bound = i;
            if (lcm[i] > 1e9) {
                break;
            }
        }
        for (int i = 0; i < q; i++) {
            int t = readInt();
            if (t == 0) {
                System.out.println(-1);
                continue;
            }
            int low = 0;
            int high = Math.min(bound, n);
            int ans = -1;
            while (low <= high) {
                int mid = (low + high) / 2;
                if (t % lcm[mid] != 0) {
                    ans = mid + 1;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }

    static long LCM(long x, long y) {
        return x / gcd(x, y) * y;
    }

    static long gcd(long x, long y) {
        if (y == 0) {
            return x;
        }
        return gcd(y, x % y);
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

    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}