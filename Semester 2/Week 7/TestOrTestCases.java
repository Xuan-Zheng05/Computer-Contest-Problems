import java.util.*;
import java.io.*;

public class TestOrTestCases {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    static ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
    static int l;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        l = readInt();
        for (int i = 0; i < n; i++) {
            int numbers = readInt();
            ArrayList<String> temp = new ArrayList<String>();
            for (int j = 0; j < numbers; j++) {
                temp.add(next());
            }
            Collections.sort(temp);
            list.add(temp);
        }

        ArrayList<String> first = list.get(0);

        for (int i = 0; i < first.size(); i++) {
            System.out.println(first.get(i));
            if (l != 1) {
                possibleWords(first.get(i), 1, l);
            }
        }

    }

    static void possibleWords(String word, int index, int length) {
        for (int i = index; i < list.size(); i++) {
            ArrayList<String> temp = list.get(i);
            for (int j = 0; j < temp.size(); j++) {
                String add = temp.get(j);
                add = word + add;
                System.out.println(add);
                if (!(add.length() > length - 1)) {
                    possibleWords(add, i + 1, length);
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