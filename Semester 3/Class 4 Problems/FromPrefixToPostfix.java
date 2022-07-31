import java.util.*;
import java.io.*;

public class FromPrefixToPostfix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<String> stack = new Stack<>();
        String line = readLine();
        while (line.length() > 1 && line.charAt(0) != '0') {
            for (int i = line.length() - 1; i >= 0; i -= 2) {
                if (isOperator(line.charAt(i))) {
                    String op1 = stack.pop();
                    String op2 = stack.pop();

                    String temp = op1 + " " + op2 + " " + line.charAt(i);
                    stack.push(temp);
                } else {
                    stack.push(line.charAt(i) + "");
                }
            }
            System.out.println(stack.pop());
            line = readLine();
        }
    }

    static boolean isOperator(char x) {
        switch (x) {
            case '+':
            case '-':
            case '/':
            case '*':
                return true;
        }
        return false;
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
