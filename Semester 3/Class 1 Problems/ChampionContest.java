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
        int[] pair1 = new int[k];
        int[] pair2 = new int[k];

        for (int i = 0; i < n; i++) {
            champs[i] = readInt();
            sortedChamps[i] = champs[i];
        }

        for (int i = 0; i < k; i++) {
            pair1[i] = readInt();
            pair2[i] = readInt();
        }

        Arrays.sort(sortedChamps);

        for (int i = 0; i < n; i++) {
            int cantFight = 0;
            for (int j = 0; j < k; j++) {
                if (pair1[j] == i + 1) {
                    if (champs[i] > champs[pair2[j] - 1]) {
                        cantFight++;
                    }
                } else if (pair2[j] == i + 1) {
                    if (champs[i] > champs[pair1[j] - 1]) {
                        cantFight++;
                    }
                }
            }

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

            System.out.print((index - cantFight) + " ");
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