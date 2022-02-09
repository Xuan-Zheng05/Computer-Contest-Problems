import java.util.*;
import java.io.*;

public class SnowCalls {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int n = readInt();

        for (int i = 0; i < n; i++) {
            String[] words = readLine().split("");
            List<String> finalSentence = new ArrayList<String>();
            for (int j = 0; j < words.length; j++) {
                String letter = words[j];
                if (letter.equals("-")) {
                    continue;
                }
                switch (letter) {
                    case "A":
                        letter = "2";
                        break;
                    case "B":
                        letter = "2";
                        break;
                    case "C":
                        letter = "2";
                        break;
                    case "D":
                        letter = "3";
                        break;
                    case "E":
                        letter = "3";
                        break;
                    case "F":
                        letter = "3";
                        break;
                    case "G":
                        letter = "4";
                        break;
                    case "H":
                        letter = "4";
                        break;
                    case "I":
                        letter = "4";
                        break;
                    case "J":
                        letter = "5";
                        break;
                    case "K":
                        letter = "5";
                        break;
                    case "L":
                        letter = "5";
                        break;
                    case "M":
                        letter = "6";
                        break;
                    case "N":
                        letter = "6";
                        break;
                    case "O":
                        letter = "6";
                        break;
                    case "P":
                        letter = "7";
                        break;
                    case "Q":
                        letter = "7";
                        break;
                    case "R":
                        letter = "7";
                        break;
                    case "S":
                        letter = "7";
                        break;
                    case "T":
                        letter = "8";
                        break;
                    case "U":
                        letter = "8";
                        break;
                    case "V":
                        letter = "8";
                        break;
                    case "W":
                        letter = "9";
                        break;
                    case "X":
                        letter = "9";
                        break;
                    case "Y":
                        letter = "9";
                        break;
                    case "Z":
                        letter = "9";
                        break;
                }
                finalSentence.add(letter);
            }
            for (int k = 0; k < 3; k++) {
                System.out.print(finalSentence.get(k));
            }
            System.out.print("-");
            for (int k = 3; k < 6; k++) {
                System.out.print(finalSentence.get(k));
            }
            System.out.print("-");
            for (int k = 6; k < 10; k++) {
                System.out.print(finalSentence.get(k));
            }
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