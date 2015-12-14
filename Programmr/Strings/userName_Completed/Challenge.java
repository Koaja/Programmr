package userName_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter username: ");
		String input = sc.next();

		// Write your code here
		if (input.equals("Admin") || input.equals("ADMIN")) {
			System.out.println("Username accepted");
		} else {
			System.out.println("Invalid username");
		}
		// End
	}

}
