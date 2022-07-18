import java.util.*;
import java.io.*;

public class TheresAnEssayInMyCode {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        for (int j = 0; j < 5; j++) {
            String str = readLine();
            int len = str.length();
            char[] ch = new char[len];

            for (int i = 0; i < len; i++)
                ch[i] = str.charAt(i);

            int index = 0;
            int countcomm = 0;

            do {
                if (ch[index] == '"') {
                    if (countcomm != 0)
                        System.out.print(" ");
                    index++;
                    while (ch[index] != '"') {
                        System.out.print(ch[index]);
                        index++;

                    }
                    index++;
                    countcomm++;

                } else if (ch[index] == '\'') {
                    if (countcomm != 0)
                        System.out.print(" ");
                    index++;
                    while (ch[index] != '\'') {
                        System.out.print(ch[index]);
                        index++;
                    }
                    index++;
                    countcomm++;

                } else if (ch[index] == '/' & index < (len - 1) & ch[index + 1] == '*') {

                    if (countcomm != 0)
                        System.out.print(" ");

                    index += 2;
                    while (!(ch[index] == '*' && ch[index + 1] == '/')) {
                        System.out.print(ch[index]);
                        index++;
                    }
                    countcomm++;
                    index += 2;

                } else if (ch[index] == '/' && ch[index + 1] == '/') {
                    if (countcomm != 0)
                        System.out.print(" ");
                    index += 2;
                    while (index < len) {
                        System.out.print(ch[index]);
                        index++;
                    }
                    index += 2;
                    countcomm++;

                } else
                    index++;

            } while (index < len - 2);
            System.out.println();
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