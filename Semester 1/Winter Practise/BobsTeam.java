import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class BobsTeam {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BigInteger different = new BigInteger("0");
        int n = readInt();
        long[] class1 = new long[n], class2 = new long[n], class3 = new long[n];
        for (int i = 0; i < n; i++) {
            class1[i] = readLong();
        }
        for (int i = 0; i < n; i++) {
            class2[i] = readLong();
        }
        for (int i = 0; i < n; i++) {
            class3[i] = readLong();
        }
        Arrays.sort(class1);
        // Arrays.sort(class2);
        Arrays.sort(class3);

        for (int i = 0; i < n; i++) {
            long a = searchInsert(class1, class2[i], true);
            long b = searchInsert(class3, class2[i], false);
            different = different.add(BigInteger.valueOf(a).multiply(BigInteger.valueOf(n - b)));
        }
        System.out.println(different);
    }

    static long searchInsert(long[] numbers, long target, boolean a) {
        int left = 0;
        int right = numbers.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers[mid] == target) {
                if (a)
                    return mid;
                else
                    return mid + 1;

            } else if (numbers[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
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