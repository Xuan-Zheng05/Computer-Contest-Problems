import java.util.*;
import java.io.*;

public class CellPhoneMessaging {

    static BufferedReader br = getBufferedReader(true);
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {

        int button1, button2;
        String input = "";
        while (input != "halt") {
            int time = 0;

            input = readLine();
            if (input.equals("halt")) {
                System.exit(0);
            }

            for (int i = 0; i < input.length(); i++) {
                char temp = input.charAt(i);

                button1 = 0;
                button2 = -1;
                if (i < input.length() - 1) {
                    if (temp == 'a' || temp == 'b' || temp == 'c') {
                        button1 = 1;
                    }
                    if (input.charAt(i + 1) == 'a' || input.charAt(i + 1) == 'b' || input.charAt(i + 1) == 'c') {
                        button2 = 1;
                    }
                    if (temp == 'd' || temp == 'e' || temp == 'f') {
                        button1 = 2;
                    }
                    if (input.charAt(i + 1) == 'd' || input.charAt(i + 1) == 'e' || input.charAt(i + 1) == 'f') {
                        button2 = 2;
                    }
                    if (temp == 'g' || temp == 'h' || temp == 'i') {
                        button1 = 3;
                    }
                    if (input.charAt(i + 1) == 'g' || input.charAt(i + 1) == 'h' || input.charAt(i + 1) == 'i') {
                        button2 = 3;
                    }
                    if (temp == 'j' || temp == 'k' || temp == 'l') {
                        button1 = 4;
                    }
                    if (input.charAt(i + 1) == 'j' || input.charAt(i + 1) == 'k' || input.charAt(i + 1) == 'l') {
                        button2 = 4;
                    }
                    if (temp == 'm' || temp == 'n' || temp == 'o') {
                        button1 = 5;
                    }
                    if (input.charAt(i + 1) == 'm' || input.charAt(i + 1) == 'n' || input.charAt(i + 1) == 'o') {
                        button2 = 5;
                    }
                    if (temp == 'p' || temp == 'q' || temp == 'r' || temp == 's') {
                        button1 = 6;
                    }
                    if (input.charAt(i + 1) == 'p' || input.charAt(i + 1) == 'q' || input.charAt(i + 1) == 'r'
                            || input.charAt(i + 1) == 's') {
                        button2 = 6;
                    }
                    if (temp == 't' || temp == 'u' || temp == 'v') {
                        button1 = 7;
                    }
                    if (input.charAt(i + 1) == 't' || input.charAt(i + 1) == 'u' || input.charAt(i + 1) == 'v') {
                        button2 = 7;
                    }
                    if (temp == 'w' || temp == 'x' || temp == 'y' || temp == 'z') {
                        button1 = 8;
                    }
                    if (input.charAt(i + 1) == 'w' || input.charAt(i + 1) == 'x' || input.charAt(i + 1) == 'y'
                            || input.charAt(i + 1) == 'z') {
                        button2 = 8;
                    }
                }
                if (button1 == button2) {
                    time += 2;
                }

                if (temp > 96 && temp < 100) {
                    for (int j = 97; j < 100; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 99 && temp < 103) {
                    for (int j = 100; j < 103; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 102 && temp < 106) {
                    for (int j = 103; j < 106; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 105 && temp < 109) {
                    for (int j = 106; j < 109; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 108 && temp < 112) {
                    for (int j = 109; j < 112; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 111 && temp < 116) {
                    for (int j = 112; j < 116; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 115 && temp < 119) {
                    for (int j = 116; j < 119; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
                if (temp > 118 && temp < 123) {
                    for (int j = 119; j < 123; j++) {
                        if (temp == j) {
                            time++;
                            break;
                        } else {
                            time++;
                        }
                    }
                }
            }
            System.out.println(time);
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