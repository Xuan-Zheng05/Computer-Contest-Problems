import java.util.*;
import java.io.*;

public class SimpleEncryption {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int count = 0;
        String key = readLine();
        String message = readLine();

        char[] messageChar = new char[message.length()];

        for (int i = 0; i < message.length(); i++) {
            messageChar[i] = message.charAt(i);
        }

        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {

                int output = message.charAt(i) + key.charAt(count) - 65;
                if (output > 'Z') {
                    output = 'A' + (output - 'Z' - 1);
                }

                System.out.print((char) output);

                count++;
                if (count >= key.length()) {
                    count = 0;
                }
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