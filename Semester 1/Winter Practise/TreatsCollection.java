import java.util.*;
import java.io.*;

public class TreatsCollection {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Long minimumTime = Long.MAX_VALUE;
        int n = readInt();
        int k = readInt();
        long[] arr = new long[n];

        int firstP = -1, firstN = -1;
        for (int i = 0; i < n; i++) {
            arr[i] = readInt();
            if (arr[i] > 0 && firstP == -1) {
                firstP = i;
            }
        }
        if (firstP == -1) {
            firstN = n - 1;
        } else {
            firstN = firstP - 1;
        }

        int st = 0;
        if (firstN > k) {
            st = firstN - k;
        }
        if (k == 1) {
            System.out.println(Math.abs(arr[0]));
            return;
        }

        for (int i = st; i < n - k + 1; i++) {
            if (arr[i] < 0 && arr[i + k - 1] < 0) {
                long sum = Math.abs(arr[i]);
                if (sum < minimumTime) {
                    minimumTime = sum;
                }
                continue;
            }
            if (arr[i] > 0 && arr[i + k - 1] > 0) {
                long sum = arr[i + k - 1];
                if (sum < minimumTime) {
                    minimumTime = sum;
                }
                break;
            }
            long sum = arr[i + k - 1] - arr[i];
            if (Math.abs(arr[i]) >= arr[i + k - 1]) {
                sum += arr[i + k - 1];

            } else {
                sum += Math.abs(arr[i]);
            }
            if (sum < minimumTime) {
                minimumTime = sum;
            }

        }

        // if (arr[0] > 0) {
        // minimumTime = arr[k - 1];
        // } else if (arr[arr.length - 1] < 0) {
        // minimumTime = arr[arr.length - k];
        // } else {
        // int counter = -1;
        // for (int i = 0; i < k + 1; i++) {
        // if (firstP - k + i < 0 || firstP + counter > arr.length - 1) {
        // counter++;
        // continue;
        // } else {
        // if (arr[firstP - k + i] > 0) {
        // minimumTime = Math.min(minimumTime, arr[firstP + i]);

        // } else if (arr[firstP + counter] < 0) {
        // minimumTime = Math.min(minimumTime, Math.abs(arr[firstP - k + i]));

        // // if leftmost is larger than leftmost
        // } else if (Math.abs(arr[firstP - k + i]) > Math.abs(arr[firstP + counter])) {
        // minimumTime = Math.min(minimumTime,
        // Math.abs(arr[firstP + counter])
        // + Math.abs((arr[firstP + counter]) - arr[firstP - k + i]));

        // // if rightmost is larger than leftmost
        // } else {
        // minimumTime = Math.min(minimumTime,
        // Math.abs(arr[firstP - k + i]) + Math.abs(arr[firstP - k + i] - arr[firstP +
        // counter]));

        // }
        // }
        // counter++;
        // }
        // }
        if (minimumTime == Long.MAX_VALUE) {

            System.out.println(n + " " + k + " " + firstP + " " + firstN);
        } else {
            // for (int i = 0; i < arr.length; i++) {

            // System.out.print(arr[i] + " ");
            // }
            System.out.println(minimumTime);
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