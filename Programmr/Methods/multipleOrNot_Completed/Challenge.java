package multipleOrNot_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number:");
		int x = scanner.nextInt();
		System.out.println("Enter second number:");
		int y = scanner.nextInt();

		System.out.println(multiples(x, y));

	}

	public static boolean multiples(int x, int y) {
		/// {Write your code here

		if(y % x == 0){
			return true;
		}
		
		return false;
		
		/// }
	}
}
