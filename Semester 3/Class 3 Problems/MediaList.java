import java.util.*;
import java.io.*;

public class MediaList {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), q = readInt();
        Map<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < q; i++) {

            String[] line = readLine().split(" ");
            int command = Integer.parseInt(line[0]);
            int list = Integer.parseInt(line[1]);
            String name = line[2];

            if (command == 1) {
                if (map.containsKey(name)) {
                    ArrayList<Integer> temp = map.get(name);
                    if (temp.contains(list)) {
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                } else {
                    System.out.println(0);
                }
            } else {
                if (map.containsKey(name)) {
                    ArrayList<Integer> temp = map.get(name);
                    if (!temp.contains(list)) {
                        temp.add(list);
                        map.put(name, temp);
                    }
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(list);
                    map.put(name, temp);
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
