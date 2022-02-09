import java.util.*;
import java.io.*;

public class AromaticNumbers {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int total = 0;
        int a = 0, r = 0, lastR, lastAdded;
        char[] number = readLine().toCharArray();
        for (int i = 0; i < 2; i++) {
            if (i % 2 == 0) {
                a = number[i] - '0';
            } else {
                switch (number[i]) {
                    case 'I':
                        r = 1;
                        break;
                    case 'V':
                        r = 5;
                        break;
                    case 'X':
                        r = 10;
                        break;
                    case 'L':
                        r = 50;
                        break;
                    case 'C':
                        r = 100;
                        break;
                    case 'D':
                        r = 500;
                        break;
                    case 'M':
                        r = 1000;
                        break;
                }
            }
        }
        total += a * r;
        lastR = r;
        lastAdded = a * r;
        for (int i = 2; i < number.length; i++) {
            if (i % 2 == 0) {
                a = number[i] - '0';
            } else {
                switch (number[i]) {
                    case 'I':
                        r = 1;
                        break;
                    case 'V':
                        r = 5;
                        break;
                    case 'X':
                        r = 10;
                        break;
                    case 'L':
                        r = 50;
                        break;
                    case 'C':
                        r = 100;
                        break;
                    case 'D':
                        r = 500;
                        break;
                    case 'M':
                        r = 1000;
                        break;
                }
            }
            if (i % 2 != 0) {
                total += a * r;
                if (r > lastR) {
                    total -= lastAdded * 2;
                }
                lastR = r;
                lastAdded = a * r;
            }
        }
        System.out.println(total);
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