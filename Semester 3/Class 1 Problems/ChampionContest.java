import java.util.*;
import java.io.*;

public class ChampionContest {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] champs = new int[n];
        int[] sortedChamps = new int[n];

        for (int i = 0; i < n; i++) {
            champs[i] = readInt();
            sortedChamps[i] = champs[i];
        }

        int[] cantFight = new int[n];
        for (int i = 0; i < k; i++) {
            int pair1 = readInt();
            int pair2 = readInt();

            if (champs[pair1 - 1] > champs[pair2 - 1]) {
                cantFight[pair1 - 1]++;
            } else if (champs[pair1 - 1] < champs[pair2 - 1]) {
                cantFight[pair2 - 1]++;
            }
        }

        Arrays.sort(sortedChamps);

        for (int i = 0; i < n; i++) {
            int index = Arrays.binarySearch(sortedChamps, champs[i]);

            if (index > 0) {
                int counter = index - 1;
                while (counter >= 0) {
                    if (sortedChamps[index] != sortedChamps[counter]) {
                        break;
                    } else {
                        index--;
                        counter--;
                    }
                }
            }
            System.out.print((index - cantFight[i]) + " ");
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