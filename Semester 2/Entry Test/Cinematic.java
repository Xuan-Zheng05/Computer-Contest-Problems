import java.util.*;
import java.io.*;

public class Cinematic {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), y = readInt();
        String[] titles = new String[n];
        Long[] enjoyment = new Long[n];
        HashMap<String, Long> movies = new HashMap<String, Long>();
        for (int i = 0; i < n; i++) {
            titles[i] = readLine();
        }
        for (int i = 0; i < n; i++) {
            enjoyment[i] = readLong();
        }
        for (int i = 0; i < n; i++) {
            movies.put(titles[i], enjoyment[i]);
        }

        long max = 0;
        for (int i = 0; i < y; i++) {
            String newMovie = readLine();
            if (movies.containsKey(newMovie)) {
                max += movies.get(newMovie);
                movies.remove(newMovie);
            }
        }
        System.out.println(max);
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