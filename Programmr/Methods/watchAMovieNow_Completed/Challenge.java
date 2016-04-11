package watchAMovieNow_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int review;
		double cost;
		System.out.println("Enter cost of ticket in dollars:");
		cost = scanner.nextDouble();
		System.out.println("Enter stars it received out of 5:");
		review = scanner.nextInt();
		System.out.println("Your level of interest in watching movie:");
		seeMovie(cost, review);
		scanner.close();
	}

	/// {write you code here
	public static void seeMovie(double cost, int review) {

		if ((cost < 12 && review == 5) || (cost < 5)) {
			System.out.println("very much interested");
		} else if ((cost >= 12 && review == 5) || (cost >= 5 && cost <= 11.99) && (review >= 2 && review <= 4)) {
			System.out.println("sort of interested");
		} else {
			System.out.println("not interested");
		}
	}
	/// }

}
