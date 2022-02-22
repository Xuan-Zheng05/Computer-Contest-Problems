import java.util.*;
import java.io.*;

public class HockeyBracket {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), s = readInt();
        Map<Integer, Integer> groups = new HashMap<Integer, Integer>();
        Map<Integer, Integer> points = new HashMap<Integer, Integer>();

        for (int i = 0; i < n / s; i++) {
            for (int j = 0; j < s; j++) {
                int temp = readInt();
                groups.put(temp, i + 1);
                points.put(temp, 0);
            }
        }
        for (int i = 0; i < (s - 1) * n / 2; i++) {
            int a = readInt(), b = readInt();
            char result = readCharacter();
            int value;
            if (result == 'W') {

                value = points.get(a);
                points.replace(a, value, value + 3);

            } else if (result == 'L') {

                value = points.get(b);
                points.replace(b, value, value + 3);

            } else if (result == 'T') {

                value = points.get(a);
                points.replace(a, value, value + 1);
                value = points.get(b);
                points.replace(b, value, value + 1);

            }
        }
        Map<Integer, Integer> sortedPoints = sortByValue(points);
        int k = readInt();

        for (int i = 0; i < n / s; i++) {
            ArrayList<Integer> sortedByGroup = new ArrayList<Integer>();
            for (int j : sortedPoints.keySet()) {
                if (groups.get(j) == i + 1) {
                    sortedByGroup.add(j);
                }
            }
            if (i == 0) {
                System.out.print(sortedByGroup.get(k - 1));
            } else {
                System.out.print(" " + sortedByGroup.get(k - 1));
            }
        }
        System.out.println("");
    }

    public static HashMap<Integer, Integer> sortByValue(Map<Integer, Integer> points) {

        List<Map.Entry<Integer, Integer>> list = new LinkedList<Map.Entry<Integer, Integer>>(points.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            public int compare(Map.Entry<Integer, Integer> o1,
                    Map.Entry<Integer, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        HashMap<Integer, Integer> temp = new LinkedHashMap<Integer, Integer>();
        for (Map.Entry<Integer, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
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