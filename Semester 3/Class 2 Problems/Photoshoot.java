import java.util.*;
import java.io.*;

public class Photoshoot {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        char[] s = readLine().toCharArray();
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < s.length; i += 2) {
            if (s[i] == s[i + 1])
                continue;
            if (s[i] == 'G' && s[i + 1] == 'H')
                a.add(1);
            else
                a.add(0);
        }
        int ans = 0;
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i - 1) != a.get(i))
                ans++;
        }
        if (a.size() > 0 && a.get(a.size() - 1) == 1)
            ans++;
        System.out.println(ans);
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
