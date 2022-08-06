import java.util.*;
import java.io.*;

public class Boxes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;
    static int R, C, N, a[][], col;

    public static void main(String[] args) throws IOException {
        int n = readInt(), box[][] = new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                box[i][j] = readInt();
            }
            Arrays.sort(box[i]);
        }
        int m = readInt(), item[] = new int[3];
        for (int k = 0; k < m; k++) {
            for (int j = 0; j < 3; j++)
                item[j] = readInt();
            Arrays.sort(item);
            long vol = Long.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (box[i][0] >= item[0] && box[i][1] >= item[1] && box[i][2] >= item[2]) {
                    vol = Math.min(vol, (long) box[i][0] * box[i][1] * box[i][2]);
                }
            }
            if (vol == Long.MAX_VALUE) {
                System.out.println("Item does not fit.");
            } else {
                System.out.println(vol);
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
