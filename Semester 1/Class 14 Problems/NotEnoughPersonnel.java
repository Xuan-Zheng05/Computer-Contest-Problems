import java.util.*;
import java.io.*;

public class NotEnoughPersonnel {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        String[] temp = new String[2];

        int n = readInt();
        for (int i = 0; i < n; i++) {
            temp = readLine().split(" ");
            map.put(temp[0], Integer.parseInt(temp[1]));
        }

        int q = readInt();
        int skill, adapt;
        for (int i = 0; i < q; i++) {
            String bestVeteran = "";
            int bestSkill = Integer.MAX_VALUE;
            skill = readInt();
            adapt = readInt();
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                String veteranName = entry.getKey();
                int veteranSkill = entry.getValue();

                if (veteranSkill >= skill && veteranSkill <= skill + adapt) {
                    if (veteranSkill - skill < bestSkill - skill) {
                        bestSkill = veteranSkill;
                        bestVeteran = veteranName;
                    }
                }
            }

            if (bestVeteran.equals("")) {
                System.out.println("No suitable teacher!");
            } else {
                System.out.println(bestVeteran);
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