import java.util.*;
import java.io.*;

public class Test {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] arr = { 1, 2, 3, 5, 5, 6, 9 };
        int low = 0, high = 4, output = 0;
        int number = 5;
        output = Arrays.binarySearch(arr, number);
        if (output < 0) {
            output = output * -1 - 1;
        } else {
            while (output + 1 < arr.length) {
                if (arr[output + 1] == arr[output]) {
                    output++;
                } else {
                    break;
                }
            }
        }
        System.out.println(output);
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