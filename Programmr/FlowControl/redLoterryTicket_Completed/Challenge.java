package redLoterryTicket_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c, s;
		System.out.println("Enter 3 values from 0 to 2:");
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();

		/// { write you code here

		if (a == 2 && b == 2 && c == 2) {
			s = 10;
		} else if (a == b && b == c && a == c) {
			s = 5;
		} else if (c != a && b != a) {
			s = 1;
		} else {
			s = 0;
		}

		/// }
		System.out.println("Value of your ticket:" + s);
	}

}
