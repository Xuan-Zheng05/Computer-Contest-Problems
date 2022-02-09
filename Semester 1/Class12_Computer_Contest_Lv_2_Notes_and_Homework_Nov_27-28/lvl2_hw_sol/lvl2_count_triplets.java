import java.util.*;
import java.io.*;
public class dmoj_new_english {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		int n = readInt(), a[] = new int[n];
		Set<Integer> set = new HashSet();
		for(int i=0; i<n; i++) {
			a[i] = readInt(); set.add(a[i]);
		}
		Arrays.sort(a);
		int count = 0;
		for(int i=0; i<n; i++) {
			if(i != 0 && a[i] == a[i-1]) continue;
			for(int j=i+1; j<n; j++) {
				if(j > i+1 && a[j] == a[j-1]) continue;
				if(set.contains(a[i]+a[j])) count++;
			}
		}
		System.out.println(count);
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