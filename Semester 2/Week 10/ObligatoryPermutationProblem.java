import java.util.*;
import java.io.*;

public class ObligatoryPermutationProblem {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int N = readInt();
        long K = readLong();
        ArrayList<ArrayList<Integer>> cycles = new ArrayList<>();
        int temp[] = new int[N + 1];
        int p[] = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            temp[i] = i;
            p[i] = readInt();
        }
        int[] dir = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            dir[i] = p[i];
        }
        HashSet<Integer> seen = new HashSet<>();
        for (int i = 1; i <= N; i++) {
            ArrayList<Integer> templst = new ArrayList<>();
            int idx = i;
            while (true) {
                if (!seen.contains(idx)) {
                    templst.add(idx);
                    seen.add(idx);
                    idx = dir[idx];

                } else
                    break;
            }
            if (!templst.isEmpty()) {
                cycles.add(templst);
            }
        }
        int[] ans = new int[N + 1];
        for (int i = 0; i < cycles.size(); i++) {
            int shift = (int) (K % (long) cycles.get(i).size());
            for (int j = 0; j < cycles.get(i).size(); j++) {
                ans[cycles.get(i).get((j + shift) % cycles.get(i).size())] = p[cycles.get(i).get(j)];
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(ans[i] + " ");
        }
        // int n = readInt();
        // long k = readLong();
        // int[] num = new int[n];
        // int[] followedNum = new int[n];
        // for (int i = 0; i < n; i++) {
        // num[i] = readInt();
        // }
        // for (int i = 0; i < n; i++) {
        // followedNum[i] = num[num[i] - 1];
        // }

        // int[] num2 = new int[n];
        // for (int i = 0; i < n; i++) {
        // num2[i] = i + 1;
        // }

        // for (int i = 0; i < k; i++) {
        // for (int j = 0; j < n; j++) {
        // num2[num[j] - 1] = num[j];
        // }
        // System.out.println(Arrays.toString(num2));
        // num = Arrays.copyOf(num2, n);

        // }

        // System.out.println();
        // for (int i = 0; i < n; i++) {
        // System.out.print(num[i] + " ");
        // }
        // System.out.println();
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
