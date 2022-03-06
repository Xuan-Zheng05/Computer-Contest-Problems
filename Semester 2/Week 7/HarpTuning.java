import java.util.*;
import java.io.*;

public class HarpTuning {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String instructions = readLine();

        String strings = "";
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '+' || instructions.charAt(i) == '-') {
                System.out.print(strings + " ");
                strings = "";

                if (instructions.charAt(i) == '+') {
                    System.out.print("tighten ");
                } else if (instructions.charAt(i) == '-') {
                    System.out.print("loosen ");
                }

            } else if (instructions.charAt(i) >= '1' && instructions.charAt(i) <= '9') {
                System.out.print(instructions.charAt(i));

            } else if (i > 0 && instructions.charAt(i - 1) >= '1' && instructions.charAt(i - 1) <= '9') {
                System.out.println();
                strings += instructions.charAt(i);
            } else {
                strings += instructions.charAt(i);
            }
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