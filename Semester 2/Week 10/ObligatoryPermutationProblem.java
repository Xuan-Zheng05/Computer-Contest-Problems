import java.util.*;
import java.io.*;

public class ObligatoryPermutationProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] num = new int[n];
        // int[] followedNum = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = readInt();
        }
        // for (int i = 0; i < n; i++) {
        // followedNum[i] = num[num[i] - 1];
        // System.out.println(followedNum[i]);
        // }

        int[] num2 = new int[n];
        for (int i = 0; i < n; i++) {
            num2[i] = i + 1;
        }

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                num[j] = num2[num[j] - 1];
            }
            System.out.println();
        }
        if (k % 2 == 0) {
            // print num
        } else {
            // print num2
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
