import java.util.*;
import java.io.*;
public class Test {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
    public static int [] size;
    public static int [] disjoint;
    public static int findRoot(int i){
        if (disjoint[i]==i){
            return i;
        } else {
            return disjoint[i] = findRoot(disjoint[i]);
        }
    }
    public static void merge(int n,int m){
        int parN = findRoot(n);
        int parM = findRoot(m);
        if(parN == parM) return;
        size[parN]+=size[parM];
        disjoint[parM] = parN;
    }
    public static void main(String[] args) throws IOException{
        //Scanner input = new Scanner(System.in);
        int n = readInt();
        int m = readInt();
        disjoint = new int [n+1];
        size = new int [n+1];
        for(int i = 1;i<=n;i++){
            disjoint[i] = i;
            size[i] = 1;
        }
        for (int i = 0;i<m;i++){
            int k = readInt(), p = readInt();
            for(int j=1; j<k; j++){
            	int q = readInt();
            	merge(p, q);
            }
        }
        int f1 = findRoot(1);
        System.out.println(size[f1]);
        for(int i = 1;i<=n;i++){
            if(findRoot(i)==f1){
                System.out.print(i+" ");
            }
        }
        
    }
	static String next () throws IOException {
		while (st == null || !st.hasMoreTokens())
			st = new StringTokenizer(br.readLine().trim());
		return st.nextToken();
	}
	static long readLong () throws IOException {
		return Long.parseLong(next());
	}
	static int readInt () throws IOException {
		return Integer.parseInt(next());
	}
	static double readDouble () throws IOException {
		return Double.parseDouble(next());
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}