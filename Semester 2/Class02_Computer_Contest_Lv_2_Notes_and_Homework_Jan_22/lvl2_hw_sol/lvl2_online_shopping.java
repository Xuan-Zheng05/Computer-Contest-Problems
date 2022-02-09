import java.io.*;
import java.util.*;
public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    public static void main(String args[]) throws IOException{
    	for(int T = readInt(); T > 0; T--) {
    		int N = readInt(); Map<String, List<item>> map = new HashMap<>();
    		for(int i=1; i<=N; i++) {
    			int M = readInt();  //# of items
    			for(int j=1; j<=M; j++) {
    				String name = next(); int p = readInt(), q = readInt();
    				if(!map.containsKey(name)) map.put(name, new ArrayList<>());
    				map.get(name).add(new item(p, q));
    			}
    		}
    		//System.out.println(map);
    		int K = readInt(), cost = 0;
    		for(int i=1; i<=K; i++) {
    			String name = next(); int need = readInt();
    			Collections.sort(map.get(name));
    			for(item e : map.get(name)) {
    				if(e.amount >= need) {
    					cost += e.price * need;
    					need = 0;  break;
    				}else {
    					cost += e.price * e.amount;
    					need -= e.amount;
    				}
    			}
    		}
    		System.out.println(cost);
    	}
    }
    static class item implements Comparable<item>{
    	int price, amount;
    	item(int p, int a) { price = p; amount = a; }
    	public String toString() { return "price =" + price + " amount=" + amount; }
    	public int compareTo(item x) { return Integer.compare(price, x.price); }
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
    static String readLine() throws IOException {
        return br.readLine().trim();
    }
}