import java.util.*;
import java.io.*;

public class PostfixNotation {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        Stack<Double> stack = new Stack<>();
        String[] line = readLine().split(" ");
        for (int i = 0; i < line.length; i++) {
            String letter = line[i];
            if (letter.equals("*")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = op1 * op2;
                stack.push(value);
            } else if (letter.equals("/")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = op1 / op2;
                stack.push(value);
            } else if (letter.equals("+")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = op1 + op2;
                stack.push(value);
            } else if (letter.equals("-")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = op1 - op2;
                stack.push(value);
            } else if (letter.equals("%")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = op1 % op2;
                stack.push(value);
            } else if (letter.equals("^")) {
                double op2 = stack.pop();
                double op1 = stack.pop();
                double value = Math.pow(op1, op2);
                stack.push(value);
            } else {
                double num = Double.parseDouble(letter);
                stack.push(num);
            }
        }
        System.out.printf("%.2f", stack.pop());
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
