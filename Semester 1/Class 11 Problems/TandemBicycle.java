import java.util.*;
import java.io.*;

public class TandemBicycle {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long pairs = 0;
        int students = readInt();
        int weight = readInt();
        int largestPossible = students - 1;
        int[] arr = new int[students];

        for (int i = 0; i < students; i++) {
            arr[i] = readInt();
        }

        Arrays.sort(arr);

        for (int i = 0; i < students; i++) {
            for (int j = largestPossible; j > i; j--) {
                if (arr[i] + arr[j] <= weight) {
                    pairs += j - i;
                    break;
                } else {
                    largestPossible = j;
                }
            }
        }
        System.out.println(pairs);

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