import java.util.*;
import java.io.*;

public class QuintessentialQuestions {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), m = readInt(), k = readInt();
        int[] best = new int[n];
        int[] bestProfessor = new int[n];
        for (int i = 0; i < k; i++) {
            int professor = readInt();
            int asked = readInt();
            int rating = readInt();
            if (rating > best[asked - 1]) {
                bestProfessor[asked - 1] = professor;
                best[asked - 1] = rating;
            }
        }
        for (int i = 0; i < n; i++) {
            if (bestProfessor[i] == 0) {
                System.out.print(-1 + " ");
            } else {
                System.out.print(bestProfessor[i] + " ");
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
