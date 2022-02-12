import java.util.*;
import java.io.*;

public class NailedIt {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] boards = new int[n];
        for (int i = 0; i < n; i++) {
            boards[i] = readInt();
        }

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int height = boards[i] + boards[j];
                if (map.get(height) == null) {
                    map.put(height, 1);
                } else {
                    int times = map.get(height) + 1;
                    map.put(height, times);
                }
            }
        }
        int bestValue = 0;
        int differentTimes = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            if (value > bestValue) {
                differentTimes = 1;
                bestValue = value;
            } else if (value == bestValue) {
                differentTimes++;
            }
        }
        System.out.println(bestValue + " " + differentTimes);
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