import java.util.*;
import java.io.*;

public class CountingLiars {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        List<Integer> g = new ArrayList<>(), l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            char c = readCharacter();
            int x = readInt();
            if (c == 'G')
                g.add(x);
            else
                l.add(x);
        }
        Collections.sort(g);
        Collections.sort(l);
        int correct = 0;
        for (int i = 0, j = 0; i < g.size(); i++) {
            while (j < l.size() && g.get(i) > l.get(j))
                j++;
            correct = Math.max(correct, i + 1 + l.size() - j);
        }
        System.out.println(n - correct);
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
