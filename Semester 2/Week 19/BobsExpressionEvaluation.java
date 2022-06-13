import java.util.*;
import java.io.*;

public class BobsExpressionEvaluation {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int t = 1; t <= 5; t++) {
            String s[] = readLine().split(" ");
            Stack<Integer> stk = new Stack<>();
            if (s[0].charAt(0) >= '0' && s[0].charAt(0) <= '9') {
                for (int i = 0; i < s.length; i++) {
                    char c = s[i].charAt(0);
                    if (c >= '0' && c <= '9')
                        stk.push(Integer.parseInt(s[i]));
                    else {
                        int op2 = stk.pop(), op1 = stk.pop();
                        if (c == '+')
                            stk.push(op1 + op2);
                        if (c == '-')
                            stk.push(op1 - op2);
                        if (c == '*')
                            stk.push(op1 * op2);
                        if (c == '/')
                            stk.push(op1 / op2);
                        if (c == '%')
                            stk.push(op1 % op2);
                    }
                }
            } else {
                for (int i = s.length - 1; i >= 0; i--) {
                    char c = s[i].charAt(0);
                    if (c >= '0' && c <= '9')
                        stk.push(Integer.parseInt(s[i]));
                    else {
                        int op1 = stk.pop(), op2 = stk.pop();
                        if (c == '+')
                            stk.push(op1 + op2);
                        if (c == '-')
                            stk.push(op1 - op2);
                        if (c == '*')
                            stk.push(op1 * op2);
                        if (c == '/')
                            stk.push(op1 / op2);
                        if (c == '%')
                            stk.push(op1 % op2);
                    }
                }
            }
            System.out.println(stk.pop());
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
