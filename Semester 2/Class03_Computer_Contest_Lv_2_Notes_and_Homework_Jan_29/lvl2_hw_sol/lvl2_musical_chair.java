import java.io.*;
import java.util.*;

public class lvl2_musical_chair {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<String> sol = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        int N = readInt(), K = readInt();
        boolean[] isEmpty = new boolean[N];
        int[] Chairs = new int[N];
        Arrays.fill(isEmpty, false);
        Arrays.fill(Chairs, -1);
        Stack<Integer> students = new Stack<>();
        for (int i = 0; i < K; i++) {
            int num = readInt();
            isEmpty[num - 1] = true;
        }
        for (int i = 1; i <= K + 1; i++) {
            int num = readInt();
            Chairs[num - 1] = i;
        }

        int counter = 0;
        int j = K;
        while (j > 0) {
            if (counter == N) {
                counter = 0;
            }
            if (Chairs[counter] != -1) {
                students.push(Chairs[counter]);
                Chairs[counter] = -1;
            }
            if (isEmpty[counter] && !students.isEmpty()) {
                students.pop();
                isEmpty[counter] = false;
                j--;
            }
            counter++;

        }
        int last = students.pop();
        System.out.println(last);

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