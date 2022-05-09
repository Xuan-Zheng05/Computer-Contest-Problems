import java.util.*;
import java.io.*;

public class Luggage {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            list[i] = readInt();
        }
        Arrays.sort(list);
        int highest = 1;
        for (int i = 0; i < n; i++) {
            int highestNum = list[i] + k;
            int index = Arrays.binarySearch(list, highestNum);
            if (index < 0) {
                highest = Math.max(highest, (index * -1 - 2) - (i - 1));
            } else {
                highest = Math.max(highest, index - (i - 1));
            }
        }
        System.out.println(highest);
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
