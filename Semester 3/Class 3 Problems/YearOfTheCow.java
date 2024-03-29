import java.util.*;
import java.io.*;

public class YearOfTheCow {

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
        HashMap<String, String> chineseYear = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] line = readLine().split(" ");
            String name = line[0];
            chineseYear.put(name, line[4]);
            if (line[7].equals("Bessie")) {

                int year = 0;
                if (line[3].equals("previous")) {
                    year = years.get(line[4]) - 13;
                } else {
                    year = years.get(line[4]) - 1;
                    if (year == 0)
                        year = 12;
                }
                map.put(name, year);
            } else {
                String previousName = line[7];
                int previousYear = map.get(previousName);
                int year = 0;

                String c_year = chineseYear.get(previousName);
                Integer c_year_n = years.get(c_year);
                int y = years.get(line[4]);
                if (line[3].equals("previous")) {

                    if (y > c_year_n) {
                        year = (12 + c_year_n - y) * -1;
                    } else if (y == c_year_n) {
                        year = -12;
                    } else {
                        year = y - c_year_n;
                    }

                } else {
                    if (y > c_year_n) {
                        year = y - c_year_n;
                    } else {
                        year = 12 + y - c_year_n;
                    }
                }
                year += previousYear;
                map.put(name, year);
                if (name.equals("Elsie")) {
                    System.out.println(Math.abs(map.get(name)));
                }
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