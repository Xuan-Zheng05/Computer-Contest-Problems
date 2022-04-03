import java.util.*;
import java.io.*;

public class ObligatoryStringProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int k;
    static char[] b;
    static boolean first = false;
    static ArrayList<String> valid = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        k = readInt();
        char[] a = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                'u', 'v', 'w', 'x', 'y', 'z' };
        b = readLine().toCharArray();

        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 24; j++) {
                for (int k = 0; k < 24; k++) {
                    for (int l = 0; l < 24; l++) {
                        // String perm =
                    }
                }
            }
        }

        boolean[] used = new boolean[a.length];
        List<Character> perm = new ArrayList<>();
        fun(a, used, perm);

        Collections.sort(valid);
        for (int i = 0; i < valid.size(); i++) {
            System.out.println(valid.get(i));
        }
    }

    static void fun(char[] a, boolean[] used, List<Character> perm) {
        if (perm.size() == 4) {

            int distance = 0;
            distance = findDistance(b, perm);
            int counter = 0;
            String temp = "";
            if (distance <= k) {
                for (int i = 0; i < perm.size(); i++) {
                    temp = temp + Character.toString(perm.get(i));
                    if (perm.get(i) == b[i]) {
                        counter++;
                    }
                }
                if (counter < 4) {
                    valid.add(temp);
                }
            }
            return;
        }

        for (int i = 0; i < a.length; i++) {

            if (!used[i]) {
                perm.add(a[i]);
                used[i] = true;

                fun(a, used, perm);
                perm.remove(perm.size() - 1);
                used[i] = false;
            }
        }
    }

    static int findDistance(char[] b, List<Character> perm) {
        int distance = 0;
        for (int i = 0; i < b.length; i++) {
            distance += Math.min(Math.abs(b[i] - perm.get(i)), b[i] - 'a' + 'z' - perm.get(i) + 1);
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
