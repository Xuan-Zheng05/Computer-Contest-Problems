import java.util.*;
import java.io.*;

public class ObligatoryGeometryProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] shapes = new int[n];
        int q = readInt();
        for (int i = 0; i < q; i++) {
            String[] query = readLine().split(" ");
            if (query[0].equals("set")) {
                if (query[1].equals("square")) {
                    shapes[Integer.parseInt(query[2]) - 1] = 1;
                } else if (query[1].equals("circle")) {
                    shapes[Integer.parseInt(query[2]) - 1] = 2;
                } else if (query[1].equals("triangle")) {
                    shapes[Integer.parseInt(query[2]) - 1] = 3;
                }
            } else {
                int shape = shapes[Integer.parseInt(query[2]) - 1];
                if (query[1].equals("square")) {
                    if (shape == 1) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
                if (query[1].equals("circle")) {
                    if (shape == 2) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
                if (query[1].equals("triangle")) {
                    if (shape == 3) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                }
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
