import java.util.*;
import java.io.*;

public class YearOfTheCowFix {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        String[] calender = { "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat" };

        int n = readInt();
        HashMap<String, Integer> years = new HashMap<>();
        for (int i = 1; i <= calender.length; i++) {
            years.put(calender[i - 1], i);
        }
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = readLine().split(" ");
            String name = line[0];
            if (line[7].equals("Bessie")) {

                int year = 0;
                if (line[3].equals("previous")) {
                    year = years.get(line[4]) - 13;
                } else {
                    year = years.get(line[4]) - 1;
                }
                map.put(name, year);
            } else {

            }
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