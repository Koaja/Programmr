package keychainsShopForRealThisTime;

import java.util.Scanner;

class Challenge {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome To The Keychain Shop!");
		Challenge obj = new Challenge();
		obj.menu();
	}

	public void menu() {
		int choice, keyChains = 0, price = 10;

		while (true) {
			System.out.print(
					"1. Add Keychains to Order.\n2. Remove Keychains from Order.\n3. View Current Order.\n4. Checkout.\nPlease Enter Your Choice-");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				// keyChains = addKeychains(keyChains);
				break;
			case 2:
				// keyChains = removeKeychains(keyChains);
				break;
			case 3:
				// viewOrder(keyChains, price);
				break;
			default:
				// checkout(keyChains, price);
				return;
			}
		}
	}
	/// {Write your code here.

	/// }
}
