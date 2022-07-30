import java.util.*;
import java.io.*;

public class ConspicuousCrypticChecklist {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int comAssign = 0;
        int numItems = readInt();
        int assignments = readInt();
        String[] items = new String[numItems];

        for (int i = 0; i < numItems; i++) {
            items[i] = readLine();

        }
        for (int k = 0; k < assignments; k++) {
            int haveItem = 0;
            int numRequiredItems = readInt();
            String[] requiredItems = new String[numRequiredItems];
            for (int m = 0; m < numRequiredItems; m++) {
                requiredItems[m] = readLine();

            }
            for (int j = 0; j < items.length; j++)
                for (int n = 0; n < numRequiredItems; n++) {

                    if (items[j].equals(requiredItems[n])) {
                        haveItem++;
                    }
                }
            if (haveItem == numRequiredItems) {
                comAssign++;
            }
        }
        System.out.println(comAssign);
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
