package keychainsShop;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		System.out.println("Welcome To The Keychain Shop!");
		Challenge obj = new Challenge();
		obj.menu();
	}

	public void menu() {
		Scanner sc = new Scanner(System.in);
		int choice;

		while (true) {
			System.out.println(
					"\n1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice: ");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// addKeychains();
				break;
			case 2:
				// removeKeychains();
				break;
			case 3:
				// viewOrder();
				break;
			case 4:
				// checkout();
				System.exit(0);
				break;
			default:
				System.out.print("Incorrect Choice.");
			}
		}
	}
	/// {Write your code here.

	/// }
}
