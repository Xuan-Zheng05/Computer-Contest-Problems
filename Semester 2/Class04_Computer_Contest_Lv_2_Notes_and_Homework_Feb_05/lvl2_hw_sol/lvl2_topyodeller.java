import java.util.*;
import java.io.*;
public class homework {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
		int n = readInt(), k = readInt(), score[] = new int[n+1];
		List<yodeller> list = new ArrayList();
		for(int i=1; i<=n; i++) list.add(new yodeller(i, 0, 0));
		for(int i=1; i<=k; i++) {
			for(int j=1; j<=n; j++) score[j] = readInt();
			for(yodeller obj : list) obj.score += score[obj.id];
			Collections.sort(list, new cmp());
			int rank = 1;
			for(int j=0; j<list.size(); j++) {
				if(j > 0 && list.get(j).score != list.get(j-1).score) rank = j+1;
				list.get(j).worst = Math.max(list.get(j).worst, rank);
			}
//			System.out.println("After round " + i + ": ");
//			for(yodeller obj: list) System.out.println(obj);
		}
		for(int i=0; i<list.size(); i++) {
			yodeller obj = list.get(i);
			if(obj.score == list.get(0).score)
				System.out.println("Yodeller "+obj.id+" is the TopYodeller: score "+obj.score+", worst rank "+obj.worst);
		}
				
	}
	static class cmp implements Comparator<yodeller> {
		public int compare(yodeller a, yodeller b) {
			if(a.score != b.score) return -Integer.compare(a.score, b.score);
			return Integer.compare(a.id, b.id);
		}
	}
	static class yodeller{
		int id, score, worst;
		yodeller(int id0, int sc0, int rk) { id = id0; score = sc0; worst = rk; }
		public String toString() { return "Yodeller "+id +" has score " + score + " worst ranking: " + worst; }
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