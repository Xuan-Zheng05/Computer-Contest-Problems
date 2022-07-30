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
            Stack<Integer> top = new Stack<>();
            Stack<Integer> branch = new Stack<>();
            for (int j = 0; j < n; j++) {
                top.push(readInt());
            }

            int next = 1;
            Boolean loop = true;
            while (loop && next <= n) {
                if (top.size() > 0 && next == top.peek()) {
                    top.pop();
                    next++;
                } else if (branch.size() > 0 && branch.peek() == next) {
                    branch.pop();
                    next++;
                } else if (top.size() > 0) {
                    branch.push(top.pop());
                } else {
                    loop = false;
                }
            }

            if (loop) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
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
