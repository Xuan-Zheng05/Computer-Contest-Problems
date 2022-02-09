import java.util.*;
import java.io.*;

public class MusicalChairs {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] empty = new int[k];
        for (int i = 0; i < k; i++) {
            empty[i] = readInt();
        }
        // Arrays.sort(empty);

        HashMap<Integer, Integer> positions = new HashMap<Integer, Integer>();
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        for (int i = 0; i < k + 1; i++) {
            int temp = readInt();
            positions.put(temp, i + 1);
            sorted.add(temp);
        }
        Collections.sort(sorted);

        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = Collections.binarySearch(sorted, empty[i]);
            if (temp == -1) {
                sorted.remove(sorted.size() - 1);
            } else if (temp < 0) {
                sorted.remove(sorted.remove(temp * -1 - 2));
            } else {
                sorted.remove(temp);
            }
        }
        System.out.println(positions.get(sorted.get(0)));
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