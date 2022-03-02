import java.util.*;
import java.io.*;

public class HarpTuning {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        String input = readLine();

        char[] inputLetters = input.toCharArray();

        ArrayList<String> list = new ArrayList<String>();
        int index = 0;
        int start = 0;
        for (int i = 0; i < inputLetters.length; i++) {
            String instruction = "";
            int number;
            if (inputLetters[i] >= 49 && inputLetters[i] <= 57) {
                if (i + 1 < inputLetters.length) {
                    while (i + 1 < inputLetters.length && inputLetters[i + 1] > 49 && inputLetters[i + 1] < 57) {
                        i++;
                    }
                    list.add(input.substring(start, i + 1));
                    input.replace(list.get(index), "");
                    index++;
                    start = i + 1;
                } else if (i + 1 >= inputLetters.length) {
                    list.add(input.substring(start, i + 1));
                    input.replace(list.get(index), "");
                    index++;
                    start = i + 1;
                    break;
                }
                start = i + 1;
            }
        }

        String strings = "", action = "", numbers = "";
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (list.get(i).charAt(j) == 43) {
                    action = "tighten";
                    strings = list.get(i).substring(0, j);
                    numbers = list.get(i).substring(j + 1, list.get(i).length());
                    break;
                } else if (list.get(i).charAt(j) == 45) {
                    action = "loosen";
                    strings = list.get(i).substring(0, j);
                    numbers = list.get(i).substring(j + 1, list.get(i).length());
                    break;
                }
            }
            System.out.println(strings + " " + action + " " + numbers);
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