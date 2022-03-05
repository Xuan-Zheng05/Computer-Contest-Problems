import java.util.*;
import java.io.*;

public class Veci {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x = readInt();
        int[] xNums = new int[10];

        int temp = x;
        while (temp > 0) {
            int lastNum = temp % 10;
            xNums[lastNum] += 1;
            temp = temp / 10;
        }

        for (int i = x + 1; i < x + 1000000; i++) {
            int[] nums = new int[10];
            temp = i;

            while (temp > 0) {
                int lastNum = temp % 10;
                nums[lastNum] += 1;
                temp = temp / 10;
            }

            boolean print = true;
            for (int j = 0; j < 10; j++) {
                if (xNums[j] != nums[j]) {
                    print = false;
                    break;
                }
            }
            if (print) {
                System.out.println(i);
                System.exit(0);
            }
        }
        System.out.println(0);
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