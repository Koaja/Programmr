package findTheCarModel_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String category;
		System.out.print("Enter category of car:");
		category = in.next();
		System.out.print("Model available in category:");
		model(category);
		/// {write you code here

		/// }

	}

	public static void model(String category) {
		switch (category) {
		case "SUV":
			System.out.println("PAJERO");
			break;
		case "SEDAN":
			System.out.println("HONDA CITY, Hyundai VERNA, MARUTI SWIFT");
			break;
		case "Economy":
			System.out.println("SKODA LAURA, MARUTI CERVO");
			break;
		case "MINI":
			System.out.println("TATA NANO");
			break;
		default:
			System.out.println("Category does not exist");
		}
	}

	
}
