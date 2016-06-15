package luckySum_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, s;
		System.out.println("Enter 3 values:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		s = luckySum(a, b, c);
		System.out.println("Lucky sum:" + s);
	}

	public static int luckySum(int a, int b, int c) {
		/// { write you code here
		if (a == 13) {
			return 0;
		} else if (b == 13) {
			return a;
		} else if (c == 13) {
			return a + b;
		}

		return a + b + c;

		/// }
	}

}