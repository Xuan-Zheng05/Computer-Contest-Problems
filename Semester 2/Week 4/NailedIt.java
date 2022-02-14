import java.util.*;
import java.io.*;

public class NailedIt {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), maxV = 2000, freq[] = new int[maxV + 1];
        for (int i = 1; i <= n; i++)
            freq[readInt()]++;
        int max = 0, ways = 0;
        for (int len = 2; len <= 2 * maxV; len++) {
            int cnt = 0;
            for (int x = 1; x <= len / 2; x++) {
                int y = len - x;
                if (y > maxV)
                    continue;
                if (x == y)
                    cnt += freq[x] / 2;
                else
                    cnt += Math.min(freq[x], freq[y]);
            }
            if (cnt > max) {
                max = cnt;
                ways = 1;
            } else if (cnt == max)
                ways++;
        }
        System.out.println(max + " " + ways);
        // int n = readInt();
        // int[] boards = new int[n];
        // for (int i = 0; i < n; i++) {
        // boards[i] = readInt();
        // }

        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // for (int i = 0; i < n; i++) {
        // for (int j = i + 1; j < n; j++) {
        // int height = boards[i] + boards[j];
        // if (map.get(height) == null) {
        // map.put(height, 1);
        // } else {
        // int times = map.get(height) + 1;
        // map.put(height, times);
        // }
        // }
        // }
        // int bestValue = 0;
        // int differentTimes = 0;
        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // int value = entry.getValue();
        // if (value > bestValue) {
        // differentTimes = 1;
        // bestValue = value;
        // } else if (value == bestValue) {
        // differentTimes++;
        // }
        // }
        // if (bestValue == 4950) {
        // for (int i = 0; i < n; i++) {
        // System.out.print(boards[i]);
        // }

        // } else {
        // System.out.println(bestValue + " " + differentTimes);
        // }

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