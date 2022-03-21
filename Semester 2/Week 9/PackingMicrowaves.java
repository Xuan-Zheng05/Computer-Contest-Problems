import java.util.*;
import java.io.*;

public class PackingMicrowaves {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        long n = readLong();
        long[] microwave = new long[3];
        long[] truck = new long[3];

        microwave[0] = readLong();
        microwave[1] = readLong();
        microwave[2] = readLong();
        truck[0] = readLong();
        truck[1] = readLong();
        truck[2] = readLong();

        long placedA = (truck[0] / microwave[0]) * (truck[1] / microwave[1]) * (truck[2] / microwave[2]);

        long placedB = (truck[0] / microwave[0]) * (truck[1] / microwave[2]) * (truck[2] / microwave[1]);
        long placedC = (truck[0] / microwave[1]) * (truck[1] / microwave[0]) * (truck[2] / microwave[2]);
        long placedD = (truck[0] / microwave[1]) * (truck[1] / microwave[2]) * (truck[2] / microwave[0]);
        long placedE = (truck[0] / microwave[2]) * (truck[1] / microwave[0]) * (truck[2] / microwave[1]);
        long placedF = (truck[0] / microwave[2]) * (truck[1] / microwave[1]) * (truck[2] / microwave[0]);

        long bestPlace = 0;

        bestPlace = Math.max(placedA, placedB);
        bestPlace = Math.max(bestPlace, placedC);
        bestPlace = Math.max(bestPlace, placedD);
        bestPlace = Math.max(bestPlace, placedE);
        bestPlace = Math.max(bestPlace, placedF);

        if (bestPlace == 0) {
            System.out.println("SCAMMED");
            System.exit(0);
        }

        long answer = (long) Math.ceil((double) n / (double) bestPlace);
        System.out.println(answer);

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
