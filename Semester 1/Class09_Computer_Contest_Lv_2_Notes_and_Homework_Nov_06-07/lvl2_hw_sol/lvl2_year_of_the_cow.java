import java.util.*;
import java.io.*;

public class homework {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pr = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
	static StringTokenizer st;
	public static void main(String[] args) throws IOException{
   
		int n = readInt(); 
      Map<String, String> year = new HashMap(); Map<String, Integer>age = new HashMap();
      
		year.put("Bessie", "Ox"); age.put("Bessie", 0);
      
		List<String> zodiac = Arrays.asList("Ox", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig", "Rat");
		
      for(int i=1; i<=n; i++) {
			String s[] = readLine().split(" ");
			String cow = s[0], modifier = s[3], nyear = s[4], ref = s[7];
         
			if(modifier.equals("previous")) {
				int dif = (zodiac.indexOf(year.get(ref)) - zodiac.indexOf(nyear) + 12) % 12;
				if(dif == 0) dif += 12;
				year.put(cow, nyear); age.put(cow, age.get(ref) + dif);
            
			} else {
         
				int dif = (zodiac.indexOf(nyear) - zodiac.indexOf(year.get(ref)) + 12) % 12;
				if(dif == 0) dif += 12;
				year.put(cow, nyear); age.put(cow, age.get(ref) - dif);
			}
         
		}
		System.out.println(Math.abs(age.get("Bessie") - age.get("Elsie")));
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