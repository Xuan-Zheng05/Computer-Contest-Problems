import java.io.*;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException {
		Map<String, String> year = new HashMap();
		Map<String, Integer> age = new HashMap();
		String s[] = {"Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat"};
		Map<String, Integer> zodiac = new HashMap();
		for(int i=0; i<s.length; i++) {
			zodiac.put(s[i], i);
		}
		int n = readInt();
		year.put("Bessie", "Ox"); age.put("Bessie", 0);
		for(int i=0; i<n; i++) {
			String str[] = readLine().split(" ");
			String cow = str[0], order = str[3], y = str[4], ref = str[str.length-1];
			if(order.equals("previous")) {
				String ref_year = year.get(ref);
				int dif = (zodiac.get(ref_year) - zodiac.get(y) + 12)%12;
				if(dif == 0) dif+=12;
				year.put(cow, y); age.put(cow, age.get(ref) + dif);
			}else {
				String ref_year = year.get(ref);
				int dif = (zodiac.get(y) - zodiac.get(ref_year) + 12)%12;
				if(dif == 0) dif+=12;
				year.put(cow, y); age.put(cow, age.get(ref) - dif);
			}
		}
		System.out.println(Math.abs(age.get("Elsie") - age.get("Bessie")));
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