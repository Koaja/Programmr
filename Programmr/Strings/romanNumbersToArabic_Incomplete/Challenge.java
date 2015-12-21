package romanNumbersToArabic_Incomplete;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the roman numeral :");
		String rom = sc.nextLine();
		// {write your code here

		String v = "V";

		if (rom.split("").equals('v')) {
			v = "10";
		}

		System.out.println(v);

		// }
	}
}
