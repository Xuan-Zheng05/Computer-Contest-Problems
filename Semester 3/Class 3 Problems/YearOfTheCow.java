import java.util.*;
import java.io.*;

public class YearOfTheCow {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        Map<String, Integer> year = new HashMap<String, Integer>();
        Map<String, Integer> rel = new HashMap<String, Integer>();
        Map<String, Integer> zind = new HashMap<String, Integer>();
        Map<String, Integer> borns = new HashMap<String, Integer>();

        String[] calender = { "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat" };

        for (int i = 0; i < 12; i++) {
            zind.put(calender[i], i);
        }
        borns.put("Bessie", 0);
        int n = readInt();
        int d = 0;
        for (int i = 0; i < n; i++) {
            String[] sentence = readLine().split(" ");

            int a, b, years;
            boolean previous;
            String nameA = sentence[0];
            String nameB = sentence[7];
            previous = sentence[3].equals("previous") ? true : false;

            int yearA = zind.get(sentence[4]);
            int person = borns.get(nameB);
            if (previous) {
                int diff;
                if (person > yearA)
                    diff = person - yearA;
                else
                    diff = 12 + person - yearA;
                if (nameB.equals("Bessie"))
                    d = 0;
                d -= diff;
            }

            else {
                int diff;
                if (person < yearA) {
                    diff = yearA - person;
                } else {
                    diff = 12 - person + yearA;
                }
                if (nameB.equals("Bessie"))
                    d = 0;
                d += diff;
            }
            borns.put(nameA, yearA);
            if (nameA.equals("Elsie"))
                break;
        }
        System.out.println(Math.abs(d));
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