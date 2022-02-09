import java.util.*;
import java.io.*;

public class ARangeMaxQueryProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        List<Integer> listNum = new ArrayList<Integer>();
        List<Integer> listPos = new ArrayList<Integer>();

        int q = readInt();
        int p = readInt();
        char temp = readCharacter();
        int num = readInt();

        listNum.add(num);
        listPos.add(1);

        int lastAns = 0;
        int pos = 2;

        for (int i = 1; i < q; i++) {
            char command = readCharacter();
            num = readInt();
            if (command == 'A') {
                num = num ^ lastAns;
                int largestNumList = searchInsert(listNum, num);

                listNum.subList(largestNumList, listNum.size()).clear();
                listPos.subList(largestNumList, listPos.size()).clear();
                listNum.add(num);
                listPos.add(pos);
                pos++;
            } else if (command == 'Q') {
                num = num ^ lastAns;
                int ans = 0;
                int position = searchInsert1(listPos, pos - num);
                ans = listNum.get(position);
                System.out.println(ans);
                lastAns = ans;
            }
        }
        System.out.println();

    }

    static int searchInsert(List<Integer> numbers, int target) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) == target) {
                return mid;

            } else if (numbers.get(mid) <= target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    static int searchInsert1(List<Integer> numbers, int target) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (numbers.get(mid) == target) {
                return mid;

            } else if (numbers.get(mid) <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
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