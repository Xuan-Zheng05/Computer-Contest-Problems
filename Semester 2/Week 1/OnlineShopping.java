import java.util.*;
import java.io.*;

public class OnlineShopping {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        int t = readInt();
        for (int i = 0; i < t; i++) {
            List<String> items = new ArrayList<String>();
            List<Integer> price = new ArrayList<Integer>();
            List<Integer> quantity = new ArrayList<Integer>();
            int total = 0;
            int n = readInt();
            for (int j = 0; j < n; j++) {
                int m = readInt();
                for (int k = 0; k < m; k++) {
                    items.add(next());
                    price.add(readInt());
                    quantity.add(readInt());
                }
            }
            int num = readInt();
            for (int j = 0; j < num; j++) {
                boolean loop = true;

                String name = next();
                int nameQuantity = readInt();

                while (loop) {
                    int lowestPricePlace = -1;
                    for (int k = 0; k < items.size(); k++) {
                        if (items.get(k).equals(name) && lowestPricePlace == -1
                                || items.get(k).equals(name) && price.get(k) < price.get(lowestPricePlace)) {
                            lowestPricePlace = k;
                        }
                    }

                    int itemsBought;
                    if (quantity.get(lowestPricePlace) >= nameQuantity) {
                        itemsBought = nameQuantity;
                        nameQuantity = 0;
                    } else {
                        itemsBought = quantity.get(lowestPricePlace);
                        nameQuantity -= itemsBought;
                    }

                    total += itemsBought * price.get(lowestPricePlace);
                    if (nameQuantity > 0) {
                        items.remove(lowestPricePlace);
                        price.remove(lowestPricePlace);
                        quantity.remove(lowestPricePlace);
                    } else {
                        break;
                    }
                }
            }
            System.out.println(total);
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