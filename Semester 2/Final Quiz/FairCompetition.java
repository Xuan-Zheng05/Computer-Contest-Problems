import java.util.*;
import java.io.*;

public class FairCompetition {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int m = readInt(), n = readInt();
        int[] contest = new int[m];
        for (int i = 0; i < m; i++) {
            contest[i] = readInt();
        }
        Arrays.sort(contest);

        int num = contest.length - n;
        if (num > 0) {
            if (contest[num - 1] == contest[num]) {
                for (int i = num; i < contest.length - 1; i++) {
                    if (contest[i] == contest[i + 1]) {
                        continue;
                    } else {
                        System.out.println(contest.length - 1 - i);
                    }
                }
            } else {
                System.out.print(n);
            }
        } else {
            System.out.print(n);
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
