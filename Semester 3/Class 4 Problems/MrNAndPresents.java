import java.util.*;
import java.io.*;

public class MrNAndPresents {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        Deque<Pair> deque = new LinkedList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            char op = readCharacter();
            int x = readInt();
            if (op == 'F') {
                deque.addFirst(new Pair(x, i));
            } else if (op == 'E') {
                deque.addLast(new Pair(x, i));
            } else {
                map.put(x, i);
            }
        }
        for (Pair e : deque) {
            if (!map.containsKey(e.val) || map.get(e.val) < e.idx) {
                System.out.println(e.val);
            }
        }
    }

    static class Pair {
        int val, idx;

        Pair(int v0, int i0) {
            val = v0;
            idx = i0;
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
