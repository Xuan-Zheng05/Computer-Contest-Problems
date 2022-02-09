import java.util.*;
import java.io.*;

public class BirthdayGame {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt();
        int[] people = new int[n];
        for (int i = 0; i < n; i++) {
            people[i] = readInt();
        }
        int rounds = 0;
        int lowestRounds = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            rounds = 0;
            Set<Integer> set = new HashSet<Integer>();
            int start = i;
            int next = i;

            int location;
            do {
                location = people[next];
                set.add(next);
                next = location - 1;

                rounds++;
                if(rounds >= lowestRounds){
                    break;
                }
                if (next == start) {
                    lowestRounds = Math.min(rounds, lowestRounds);
                    break;
                }
            } while (!set.contains(next));
        }
        System.out.println(lowestRounds);
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