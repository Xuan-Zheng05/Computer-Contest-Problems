import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class GoingBackToTheDefinitions {

    static BufferedReader br = getBufferedReader(true);
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int num;
        int n = readInt();
        // ArrayList<Integer> list = new ArrayList<Integer>();
        Integer list[] = new Integer[n];
        for (int i = 0; i < n; i++) {
            num = readInt();
            list[i] = num;
        }

        Arrays.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer s1, Integer s2) {
                return ((s2 + "" + s1))
                        .compareTo(s1 + "" + s2);
            }
        });

        for (int j = 0; j < n; j++) {
            System.out.print(list[j]);
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

    static BufferedReader getBufferedReader(boolean fromFile) {
        try {
            if (fromFile) {
                br = new BufferedReader(new FileReader("test.txt"));
            } else {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            return br;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}