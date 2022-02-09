import java.util.*;
import java.io.*;

public class Boxes {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int itemLength, itemWidth, itemHeight, itemVolume;
        int boxSize;

        int n = readInt();

        box arr[] = new box[n];
        for (int i = 0; i < n; i++) {
            int length = readInt();
            int width = readInt();
            int height = readInt();
            arr[i] = new box(length, width, height);
        }

        int m = readInt();
        for (int i = 0; i < m; i++) {
            int smallestBox = Integer.MAX_VALUE;
            itemLength = readInt();
            itemWidth = readInt();
            itemHeight = readInt();
            itemVolume = itemLength * itemWidth * itemHeight;

            for (int j = 0; j < n; j++) {
                boxSize = arr[j].length * arr[j].width * arr[j].height;
                if (boxSize > itemVolume && boxSize < smallestBox) {
                    smallestBox = boxSize;
                }
            }
            if (smallestBox == Integer.MAX_VALUE) {
                System.out.println("Item does not fit.");
            } else {
                System.out.println(smallestBox);
            }
        }
    }

    static class box {

        int length, width, height;

        box(int l, int w, int h) {
            length = l;
            width = w;
            height = h;
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