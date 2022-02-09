import java.util.*;
import java.io.*;

public class GreatSequence {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt(), q = readInt();
        int[] sequence = new int[n];
        long[] psa = new long[n];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        sequence[0] = readInt();
        map.put(sequence[0], 0);
        psa[0] = sequence[0];

        for (int i = 1; i < n; i++) {
            sequence[i] = readInt();
            map.put(sequence[i], i);
            psa[i] = sequence[i] + psa[i - 1];
        }
        Arrays.sort(sequence);
        for (int i = 0; i < q; i++) {
            int a = readInt(), b = readInt(), x = readInt(), y = readInt();
            x--;
            y--;
            int searchA, searchB;
            if (x == 0) {
                if (psa[y] > k) {
                    if (Arrays.binarySearch(sequence, a) >= 0 && Arrays.binarySearch(sequence, b) >= 0) {
                        searchA = map.get(a);
                        searchB = map.get(b);
                        if (searchA >= x && searchA <= y && searchB >= x && searchB <= y) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No");
                        }
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
            } else {
                if (psa[y] - psa[x - 1] > k) {
                    if (Arrays.binarySearch(sequence, a) >= 0 && Arrays.binarySearch(sequence, b) >= 0) {
                        searchA = map.get(a);
                        searchB = map.get(b);
                        if (searchA >= x && searchA <= y && searchB >= x && searchB <= y) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No");
                        }
                    } else {
                        System.out.println("No");
                    }
                } else {
                    System.out.println("No");
                }
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
