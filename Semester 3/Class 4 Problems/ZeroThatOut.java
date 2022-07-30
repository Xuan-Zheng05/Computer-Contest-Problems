import java.util.*;
import java.io.*;

public class ZeroThatOut {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int k = readInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            int num = readInt();
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        int ans = 0;
        for (Integer item : stack) {
            ans += item;
        }
        System.out.println(ans);
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
