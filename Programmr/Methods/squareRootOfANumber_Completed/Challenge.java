package squareRootOfANumber_Completed;

import java.util.Scanner;

public class Challenge {

	public static double number, answer;

	public static void calculateSquare(double number) {
		/// Write your code here
		System.out.println((int) Math.sqrt(number));
		///
	}

	public static void main(String[] args) {

		Challenge challenge = new Challenge();
		final Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextDouble();
		Challenge.calculateSquare(number);

	}

}
