import java.util.*;
import java.io.*;

public class GoodGroups {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int violated = 0;
        int x = readInt();

        String[] workTogether = new String[x * 2];
        for (int i = 0; i < x * 2; i++) {
            workTogether[i] = next();
        }

        int y = readInt();
        String[] cannotWork = new String[y * 2];
        for (int i = 0; i < y * 2; i++) {
            cannotWork[i] = next();
        }

        int g = readInt();

        for (int i = 0; i < g; i++) {
            String[] group = new String[3];
            for (int j = 0; j < 3; j++) {
                group[j] = next();
            }

            int firstIndex = 0, secondIndex = 1;
            int firstIndexY = 0, secondIndexY = 1;

            for (int j = 0; j < x; j++) {
                String fconstraint = workTogether[firstIndex];
                String sconstraint = workTogether[secondIndex];

                boolean first = false;
                boolean second = false;
                for (int k = 0; k < 3; k++) {
                    if (group[k].equals(fconstraint)) {
                        first = true;
                    }
                    if (group[k].equals(sconstraint)) {
                        second = true;
                    }
                }
                if (first && !second || second && !first) {
                    violated++;
                    workTogether[firstIndex] = "-1";
                    workTogether[secondIndex] = "-1";
                }

                firstIndex += 2;
                secondIndex += 2;
            }

            // something wrong here
            for (int j = 0; j < y; j++) {
                String fconstraint = cannotWork[firstIndexY];
                String sconstraint = cannotWork[secondIndexY];
                for (int k = 0; k < 3; k++) {
                    if (group[k].equals(fconstraint)) {
                        fconstraint = " ";
                    }
                    if (group[k].equals(sconstraint)) {
                        sconstraint = " ";
                    }
                }
                if (fconstraint.equals(" ") && sconstraint.equals(" ")) {
                    violated++;
                    cannotWork[firstIndexY] = "";
                    cannotWork[secondIndexY] = "";
                }
                firstIndexY += 2;
                secondIndexY += 2;
            }

        }
        if (violated < x + y) {
            System.out.println(violated);
        } else {
            System.out.println(x + y);
        }

        // int n = readInt();
        // boolean[][] trees = new boolean[n][n];
        // int t = readInt();

        // for (int i = 0; i < t; i++) {
        // int y = readInt();
        // int x = readInt();
        // trees[y - 1][x - 1] = true;
        // }

        // int limit = 0;
        // int largest = 0;
        // int starting = 0;
        // while (limit < trees.length) {
        // boolean noTree = true;
        // if (starting + limit < trees.length) {
        // for (int j = starting; j < limit + 1 + starting; j++) {
        // if (noTree == false) {
        // break;
        // }

        // for (int k = starting; k < limit + 1 + starting; k++) {
        // if (trees[j][k] == true) {
        // noTree = false;
        // break;
        // }
        // }
        // }
        // } else {
        // limit++;
        // }
        // if (noTree && starting + limit < trees.length) {
        // limit++;
        // starting = 0;
        // largest = limit;
        // } else {
        // starting++;
        // }
        // }

        // System.out.println(largest);

    }

    static String next() throws IOException {
        while (st == null || !st.hasMoreTokens())
            st = new StringTokenizer(br.readLine());
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
        return br.readLine();
    }

}