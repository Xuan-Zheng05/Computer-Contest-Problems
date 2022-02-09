import java.util.*;
import java.io.*;

public class NotEnoughTesters {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int[] arr = new int[100000];
        int t = readInt();
        for (int i = 0; i < 100000; i++) {
            arr[i] = findPrime(i + 1);
        }

        for (int i = 0; i < t; i++) {
            int factors = 0;
            int k = readInt(), a = readInt(), b = readInt();
            for (int j = a - 1; j < b; j++) {
                if (arr[j] == k) {
                    factors++;
                }
            }
            System.out.println(factors);
        }
    }

    static int findPrime(int num) {
        int numFactors = 1;
        int temp = 0;
        ArrayList<Integer> primeFactors = new ArrayList<Integer>();
        while (num % 2 == 0) {
            temp++;
            num = num / 2;
        }
        if (temp > 0)
            primeFactors.add(temp);

        int divisor = 3;
        temp = 0;
        while (divisor * divisor <= num) {
            while (num % divisor == 0) {
                temp++;
                num = num / divisor;
            }
            if (temp > 0)
                primeFactors.add(temp);
            divisor += 2;
            temp = 0;
        }
        if (num != 1) {
            primeFactors.add(1);
        }
        for (int l = 0; l < primeFactors.size(); l++) {
            numFactors *= primeFactors.get(l) + 1;
        }
        return numFactors;
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