import java.util.*;
import java.io.*;

public class Granica {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> answers = new ArrayList<Integer>();
        int n = readInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = readInt();
        }

        for (int i = 2; i <= 10000; i++) {

            boolean print = true;
            int remainder = numbers[0] % i;

            for (int j = 1; j < n; j++) {
                if (numbers[j] % i != remainder) {
                    print = false;
                    break;
                }
            }
            if (print) {
                answers.add(i);
            }
        }
        System.out.print(answers.get(0));
        for (int i = 1; i < answers.size(); i++) {
            System.out.print(" " + answers.get(i));
        }
        System.out.println();
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