import java.util.*;
import java.io.*;

public class MimiAndBinary {

    static BufferedReader br = getBufferedReader(true);
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] s = readLine().toCharArray();
        int q = readInt();

        int[] zeroArr = new int[s.length];
        int[] oneArr = new int[s.length];
        if (s[0] - '0' == 0) {
            zeroArr[0] = 1;
            oneArr[0] = 0;
        } else if (s[0] - '0' == 1) {
            oneArr[0] = 1;
            zeroArr[0] = 0;
        }

        for (int i = 1; i < s.length; i++) {
            if (s[i] - '0' == 0) {
                zeroArr[i] = zeroArr[i - 1] + 1;
                oneArr[i] = oneArr[i - 1];
            } else if (s[i] - '0' == 1) {
                oneArr[i] = oneArr[i - 1] + 1;
                zeroArr[i] = zeroArr[i - 1];
            }
        }
        for (int i = 0; i < q; i++) {
            int x = readInt(), y = readInt(), z = readInt();
            int answer;
            if (x == 1) {
                if (z == 0) {
                    answer = Arrays.binarySearch(zeroArr, y);
                    while (answer + 1 > x) {
                        if (zeroArr[answer - 1] == zeroArr[answer]) {
                            answer--;
                        } else {
                            break;
                        }
                    }
                } else {
                    answer = Arrays.binarySearch(oneArr, y);
                    while (answer + 1 > x) {
                        if (oneArr[answer - 1] == oneArr[answer]) {
                            answer--;
                        } else {
                            break;
                        }
                    }
                }
            } else {
                if (z == 0) {
                    answer = Arrays.binarySearch(zeroArr, y + zeroArr[x - 2]);
                    while (answer + 1 > x) {
                        if (zeroArr[answer - 1] == zeroArr[answer]) {
                            answer--;
                        } else {
                            break;
                        }
                    }
                } else {
                    answer = Arrays.binarySearch(oneArr, y + oneArr[x - 2]);
                    while (answer + 1 > x) {
                        if (oneArr[answer - 1] == oneArr[answer]) {
                            answer--;
                        } else {
                            break;
                        }
                    }
                }
            }
            if (answer < 0) {
                System.out.println(-1);
            } else {
                System.out.println(answer + 1);
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

    static BufferedReader getBufferedReader(boolean fromFile) {
        try {
            if (fromFile) {
                br = new BufferedReader(new FileReader("test.txt"));
            } else {
                br = new BufferedReader(new InputStreamReader(System.in));
            }

            return br;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}