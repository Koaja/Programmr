package arithmeticOperations_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		int num1 = 0;
		int num2 = 0;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1 = sc.nextInt();

		System.out.print("Enter second number: ");
		num2 = sc.nextInt();

		Sum(num1, num2);
		Difference(num1, num2);

		System.out.print(Product(num1, num2) + "\n");

	}

	/// { Write your code here
	public static void Sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	public static void Difference(int num1, int num2) {
		int sum = num1 - num2;
		System.out.println(sum);
	}

	public static int Product(int num1, int num2) {
		return num1 * num2;
	}
	/// } End

}
