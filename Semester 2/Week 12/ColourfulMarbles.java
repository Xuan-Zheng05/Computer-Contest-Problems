import java.util.*;
import java.io.*;

public class ColourfulMarbles {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int n = readInt(), k = readInt();
        int[] num = new int[200000];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int colour = readInt();
            num[colour]++;
        }
        Arrays.sort(num);
        int index = 0;
        for (int i = 0; i < num.length; i++) {
            index = i;
            if (num[index] > 0) {
                break;
            }
        }
        for (int i = index; i < num.length; i++) {
            list.add(num[i]);
        }
        int ans = 0;
        for (int i = 0; i < list.size() - k; i++) {
            ans += list.get(i);
        }
        System.out.println(ans);

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
