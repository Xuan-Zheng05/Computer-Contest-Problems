import java.util.*;
import java.io.*;

public class CountNumberOfPairs {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = readInt();
        }
        Arrays.sort(nums);
        long pairs = 0;
        for (int i = 0; i < n - 1; i++) {
            int less = m - nums[i];
            int index = Arrays.binarySearch(nums, less);
            if (!(nums[i] > less)) {
                if (index > 0) {
                    while (index + 1 < n) {
                        if (nums[index] == nums[index + 1]) {
                            index++;
                        } else {
                            break;
                        }
                    }
                    pairs += index - i;
                } else {
                    pairs += index * -1 - 2 - i;
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
