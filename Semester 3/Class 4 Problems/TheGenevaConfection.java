import java.util.*;
import java.io.*;

public class TheGenevaConfection {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            int n = readInt();
            Stack<Integer> stack = new Stack<>();
            Stack<Integer> branch = new Stack<>();
            for (int j = 0; j < n; j++) {
                stack.push(readInt());
            }

            int next = 1;
            String result = "Y";
            while (stack.size() > 0 || branch.size() > 0) {
                int num = stack.pop();
                if (num == next) {
                    next++;
                } else {
                    branch.push(num);
                }

                if (next == n) {
                    break;
                }
            }
            System.out.println(result);
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
