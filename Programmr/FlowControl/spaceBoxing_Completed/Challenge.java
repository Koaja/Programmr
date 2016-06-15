package spaceBoxing_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		double weight;

		int opt;

		Scanner in = new Scanner(System.in);

		System.out.print("Please enter your current earth weight : ");

		weight = in.nextFloat();

		System.out.println();

		System.out.println("I have information for the following planets :");

		System.out.println(
				"1. Venus 2. Mars 3. Jupiter  4. Saturn 5. Uranus 6. Neptune, which planet are you visiting : ");

		opt = in.nextInt();
		/// { Write your code here
		switch (opt) {
		case 1:
			System.out.println("Your weight in points: " + weight * 0.78);
			break;
		case 2:
			System.out.println("Your weight in points: " + weight * 0.39);
			break;
		case 3:
			System.out.println("Your weight in points: " + weight * 2.65);
			break;
		case 4:
			System.out.println("Your weight in points: " + weight * 1.17);
			break;
		case 5:
			System.out.println("Your weight in points: " + weight * 1.05);
			break;
		case 6:
			System.out.println("Your weight in points: " + weight * 1.23);
			break;
		}
		/// }

	}

}
