import java.util.Scanner;

public class ccc13s1 {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		while (true) {
			input++;
			int[] digits = new int[5];
			for (int i = 0; i < digits.length; i++)
				digits[i] = -i;
			int dummy = 0;
			for (int inputcopy = input; inputcopy > 0; inputcopy/=10)
				digits[dummy++] = inputcopy % 10;
			if (doubleNestedFors(digits)) break;
		}
		System.out.println(input);
		s.close();
	}
	
	private static boolean doubleNestedFors(int[] digits) {
		for (int i = 0; i < digits.length - 1; i++) {
			for (int j = i + 1; j < digits.length; j++)
				if (digits[j] == digits[i]) return false;
		}
		return true;
	}
	
}
