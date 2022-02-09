import java.util.*;
import java.io.*;

public class Maternity {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int x;
        String mother, father, baby;

        mother = readLine();
        father = readLine();
        x = readInt();
        for (int i = 0; i < x; i++) {
            baby = readLine();

            if (possibleBaby(mother, father, baby))
                System.out.println("Possible baby.");
            else {
                System.out.println("Not their baby!");
            }
        }
    }

    public static boolean possibleBaby(String m, String f, String b) {
        boolean possible = true;
        for (int i = 0; i <= 4 && possible; i++)
            if (b.charAt(i) >= 'A' && b.charAt(i) <= 'E')
                possible = (m.charAt(i * 2) >= 'A' && m.charAt(i * 2) <= 'E')
                        || (m.charAt(i * 2 + 1) >= 'A' && m.charAt(i * 2 + 1) <= 'E')
                        || (f.charAt(i * 2) >= 'A' && f.charAt(i * 2) <= 'E')
                        || (f.charAt(i * 2 + 1) >= 'A' && f.charAt(i * 2 + 1) <= 'E');
            else
                possible = ((m.charAt(i * 2) >= 'a' && m.charAt(i * 2) <= 'e')
                        || (m.charAt(i * 2 + 1) >= 'a' && m.charAt(i * 2 + 1) <= 'e'))
                        && ((f.charAt(i * 2) >= 'a' && f.charAt(i * 2) <= 'e')
                                || (f.charAt(i * 2 + 1) >= 'a' && f.charAt(i * 2 + 1) <= 'e'));
        return possible;
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