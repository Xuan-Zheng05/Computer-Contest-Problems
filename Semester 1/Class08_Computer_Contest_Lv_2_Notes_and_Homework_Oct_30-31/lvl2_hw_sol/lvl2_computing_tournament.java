import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), k = readInt();
		Student arr[] = new Student[n];
		for(int i=0; i<n; i++) {
			int x = readInt(), y = readInt();
			arr[i] = new Student(x, y, i+1);
		}
		Arrays.sort(arr);
		int maxY = 0, win = 0; 
		for(int i=0; i<k; i++) {
			if(arr[i].y > maxY) { maxY = arr[i].y; win = arr[i].id; }
		}
		System.out.println(win);
	}
	static class Student implements Comparable<Student>{
		int x, y, id;
		Student(int x0, int y0, int i0) { x = x0; y = y0 ; id = i0; }
		public int compareTo(Student a) { return -Integer.compare(x, a.x); }
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
	static char readCharacter () throws IOException {
		return next().charAt(0);
	}
	static String readLine () throws IOException {
		return br.readLine().trim();
	}
}