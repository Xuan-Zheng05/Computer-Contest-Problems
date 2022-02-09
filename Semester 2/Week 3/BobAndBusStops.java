import java.util.*;
import java.io.*;

public class BobAndBusStops {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt();
        int[] busStops = new int[n];
        for (int i = 0; i < n; i++) {
            busStops[i] = readInt();
        }
        Arrays.sort(busStops);
        for (int i = 0; i < q; i++) {
            int L = readInt(), R = readInt();
            L = Arrays.binarySearch(busStops, L);
            R = Arrays.binarySearch(busStops, R);
            if (L * -1 > busStops.length) {
                System.out.println(0);
                continue;
            }
            if (L < 0) {
                L = L * -1 - 1;
            }
            if (R * -1 > busStops.length) {
                R = busStops.length - 1;
            } else if (R < 0) {
                R = R * -1 - 2;
            }
            System.out.println(R - L + 1);
        }

        // int n = readInt(), q = readInt();
        // int[] busArr = new int[n];
        // for (int i = 0; i < n; i++) {
        // busArr[i] = readInt();
        // }
        // Arrays.sort(busArr);
        // int[] numBus = new int[busArr[busArr.length - 1]];

        // int counter = 0;
        // if (busArr[counter] == 1) {
        // numBus[0] = 1;
        // counter++;
        // } else {
        // numBus[0] = 0;
        // }
        // for (int i = 1; i < numBus.length; i++) {
        // if (busArr[counter] == i + 1) {
        // numBus[i] = numBus[i - 1] + 1;
        // counter++;
        // } else {
        // numBus[i] = numBus[i - 1];
        // }
        // }
        // for (int i = 0; i < q; i++) {
        // int L = readInt(), R = readInt();
        // if (L <= numBus.length && R <= numBus.length) {
        // if (L == 1) {
        // System.out.println(numBus[R - 1]);
        // } else {
        // System.out.println(numBus[R - 1] - numBus[L - 2]);
        // }
        // } else if (R > numBus.length && L <= numBus.length) {
        // if (L == 1) {
        // System.out.println(numBus[numBus.length - 1]);
        // } else {
        // System.out.println(numBus[numBus.length - 1] - numBus[L - 2]);
        // }
        // } else {
        // System.out.println(0);
        // }
        // }
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