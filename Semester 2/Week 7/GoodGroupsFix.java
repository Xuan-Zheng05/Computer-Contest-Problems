import java.util.*;
import java.io.*;

public class GoodGroupsFix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int violated = 0;

        int x = readInt();
        String[] x1 = new String[x], x2 = new String[x];
        for (int i = 0; i < x; i++) {
            x1[i] = next();
            x2[i] = next();
        }

        int y = readInt();
        String[] y1 = new String[y], y2 = new String[y];
        for (int i = 0; i < y; i++) {
            y1[i] = next();
            y2[i] = next();
        }

        int g = readInt();
        HashMap<String, String> groups = new HashMap<String, String>();
        for (int i = 0; i < g; i++) {
            String first = next(), second = next(), third = next();
            groups.put(first, second + " " + third);
            groups.put(second, first + " " + third);
            groups.put(third, first + " " + second);
        }

        for (int i = 0; i < x; i++) {

            String[] smallGroups = groups.get(x1[i]).split(" ");

            if (!x2[i].equals(smallGroups[0]) && !x2[i].equals(smallGroups[1])) {
                violated++;
            }
        }

        for (int i = 0; i < y; i++) {

            String[] smallGroups = groups.get(y1[i]).split(" ");
            if (y2[i].equals(smallGroups[0]) || y2[i].equals(smallGroups[1])) {
                violated++;
            }
        }

        System.out.println(violated);

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
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
        return br.readLine();
    }

}