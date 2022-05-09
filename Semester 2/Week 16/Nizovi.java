import java.util.*;
import java.io.*;

public class Nizovi {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        char[] line = readLine().toCharArray();
        int numIndent = 0;
        for (int i = 0; i < line.length; i++) {
            if (line[i] == '{') {
                if (line[i + 1] == '}') {
                    i++;
                    String indent = "";
                    for (int j = 0; j < numIndent; j++) {
                        indent += " ";
                    }
                    System.out.println("{");
                    System.out.print(indent);
                    System.out.print("}");
                } else {
                    System.out.println("{");
                    numIndent += 2;
                    String indent = "";
                    for (int j = 0; j < numIndent; j++) {
                        indent += " ";
                    }
                    System.out.print(indent);
                }
            } else if (line[i] == '}') {
                System.out.println();
                numIndent -= 2;
                String indent = "";
                for (int j = 0; j < numIndent; j++) {
                    indent += " ";
                }
                System.out.print(indent + "}");
            } else if (line[i] == ',') {
                String indent = "";
                for (int j = 0; j < numIndent; j++) {
                    indent += " ";
                }
                System.out.println(",");
                System.out.print(indent);
            } else {
                System.out.print(line[i]);
            }
        }
        System.out.println();
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
