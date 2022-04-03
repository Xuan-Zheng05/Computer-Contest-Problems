import java.util.*;
import java.io.*;

public class ObligatoryStringProblemFix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int k;

    public static void main(String[] args) throws IOException {
        String[] a = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s",
                "t", "u", "v", "w", "x", "y", "z" };
        ArrayList<String> valid = new ArrayList<>();
        int n = readInt();
        String c = readLine();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                for (int k = 0; k < 26; k++) {
                    for (int l = 0; l < 26; l++) {
                        String perm = a[i] + a[j] + a[k] + a[l];
                        int distance = findDistance(c, perm);
                        if (distance <= n) {
                            valid.add(perm);
                        }
                    }
                }
            }
        }
        Collections.sort(valid);
        for (int i = 0; i < valid.size(); i++) {
            System.out.println(valid.get(i));
        }
    }

    static int findDistance(String c, String perm) {
        int distance = 0;
        for (int i = 0; i < 4; i++) {
            distance += Math.min(Math.abs(c.charAt(i) - perm.charAt(i)), c.charAt(i) - 'a' + 'z' - perm.charAt(i) + 1);
        }
        return distance;
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
