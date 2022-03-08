import java.util.*;
import java.io.*;

public class NormalProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String[] line = readLine().split("");

        String record = "";
        boolean write = false;
        for (int i = 0; i < line.length; i++) {
            if (line[i].equals("d")) {
                record = "";
                write = true;
            }

            if (write) {
                record += line[i];
            }

            if (record.length() == 7) {
                if (record.equals("demello")) {
                    System.out.println("liar");
                    System.exit(0);
                } else {
                    record = "";
                    write = false;
                }
            }
        }
        System.out.println("what are we going to do?");
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