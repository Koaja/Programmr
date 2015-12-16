package sumNumber2_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.nextLine();
		System.out.println(sumDigits(str));
	}
	/// {write you code here

	public static int sumDigits(String str) {
		str = str.replaceAll("[^\\.0123456789]", "");
		System.out.println(str);
		int sum = 0;
		String b = " ";
		for (int i = 0; i < str.length(); i++) {
			b = str.charAt(i) + "";
			sum = sum + Integer.parseInt(b);
		}

		return sum;
	}
	/// }

}
