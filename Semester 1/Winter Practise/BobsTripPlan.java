import java.util.*;
import java.io.*;

public class BobsTripPlan {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = readInt();
        int[] attractions = new int[n + 2];
        attractions[0] = 0;
        attractions[n + 1] = 0;

        int totalDistance = 0;
        for (int i = 1; i <= n; i++) {
            attractions[i] = readInt();
            totalDistance += Math.abs(attractions[i] - attractions[i - 1]);
        }
        totalDistance += Math.abs(attractions[n] - 0);

        int counter = 1;
        for (int i = 0; i < n; i++) {
            int distance = 0, removed = 0;
            int temp = totalDistance;
            removed += Math.abs(attractions[counter] - attractions[counter - 1])
                    + Math.abs(attractions[counter] - attractions[counter + 1]);
            temp -= removed;
            distance = Math.abs(attractions[counter - 1] - attractions[counter + 1]);
            System.out.println(temp + distance);
            counter++;
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