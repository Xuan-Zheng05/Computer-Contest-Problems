import java.util.*;
import java.io.*;

public class Hearth {

    static BufferedReader br = getBufferedReader(true);
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n, t;
        n = readInt();
        t = readInt();

        card arr[] = new card[n];
        for (int i = 0; i < n; i++) {
            String name = next();
            int cost = readInt();
            arr[i] = new card(name, cost);
        }
        NameComparator namecmp = new NameComparator();
        Arrays.sort(arr, namecmp);

        for (int i = 0; i < n - 2; i++) {
            for (int j = 1; j < n - 1; j++) {
                for (int k = 2; k < n; k++) {
                    if (arr[i].cost + arr[j].cost + arr[k].cost <= t && i < j && j < k) {
                        System.out.println(arr[i].name + " " + arr[j].name + " " + arr[k].name);
                    }
                }
            }
        }
    }

    static class card {

        String name;
        int cost;

        card(String s, int g) {
            name = s;
            cost = g;
        }
    }

    static class NameComparator implements Comparator<card> {
        public int compare(card a, card b) {
            return a.name.compareTo(b.name);
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