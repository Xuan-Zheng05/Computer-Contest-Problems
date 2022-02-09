import java.util.*;
import java.io.*;

public class TopYodeller {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] lowestRank = new int[n];
        int[] data = new int[n];
        for (int i = 0; i < k; i++) {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for (int j = 0; j < n; j++) {
                int point = readInt();
                data[j] += point;
                temp.add(data[j]);
            }
            List<Integer> ranking = sortIndex(temp);
            int score = -1;
            int rank = -1;
            for (int j = 0; j < n; j++) {
                int position = ranking.get(j);
                int lower = j;
                if (score != -1) {
                    if (score == temp.get(position)) {
                        lower = rank;
                    }
                }

                if (lowestRank[position] < lower) {
                    lowestRank[position] = lower;
                }
                score = temp.get(position);
                rank = lower;

            }
        }
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (data[i] > highest) {
                highest = data[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (data[i] == highest) {
                System.out.println("Yodeller " + (i + 1) + " is the TopYodeller: score " + highest + ", worst rank "
                        + (lowestRank[i] + 1));
            }
        }
    }

    public static <T extends Comparable<T>> List<Integer> sortIndex(List<T> in) {
        ArrayList<Integer> index = new ArrayList<>();
        for (int i = 0; i < in.size(); i++) {
            index.add(i);
        }

        Collections.sort(index, new Comparator<Integer>() {
            @Override
            public int compare(Integer idx1, Integer idx2) {
                return in.get(idx1).compareTo(in.get(idx2)) * (-1);
            }
        });

        return index;
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