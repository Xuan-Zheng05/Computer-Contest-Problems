import java.util.*;
import java.util.concurrent.CountedCompleter;
import java.io.*;

public class Square {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        boolean[][] square = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (readInt() == 1) {
                    square[i][j] = true;
                }
            }
        }

        int largestSquare = 0;
        int times = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int counter = 0;
                boolean continueLoop = true;

                while (counter < n) {
                    for (int k = i; k < counter && i + counter < n && j + counter < n && k + j < n
                            && k + i < n; k++) {
                        if (!square[k + i][counter + j] || !square[counter + i][k + j]) {
                            continueLoop = false;
                            break;
                        }

                    }
                    if (i + counter < n && j + counter < n) {
                        if (!square[i + counter][counter + j]) {
                            continueLoop = false;
                        }
                    }

                    if (!continueLoop) {
                        if (counter > largestSquare) {
                            largestSquare = counter;
                            times = 1;
                        } else if (largestSquare == counter) {
                            times++;
                        }
                        break;
                    }
                    counter++;
                }
            }
        }
        System.out.println(largestSquare * times);
        // int counter = 0;
        // int maxN = 1;
        // int maxnnn = 0;

        // for (int i = 1; i < n + 1; i++) {
        // int maxCount = 0;
        // for (int j = 0; j < n - counter; j++) {
        // for (int k = 0; k < n - counter; k++) {
        // boolean found = false;
        // for (int l = j; l < j + i; l++) {
        // if (found)
        // break;
        // for (int m = k; m < k + i; m++) {
        // if (square[l][m] == false) {
        // found = true;
        // break;
        // }
        // }
        // }
        // if (!found) {
        // maxCount += 1;
        // }

        // }
        // }
        // if (maxCount == 0) {
        // maxN = i - 1;
        // break;
        // } else {
        // maxnnn = maxCount;
        // }

        // counter++;
        // }
        // System.out.println(maxN * maxnnn);
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