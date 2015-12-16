package maxBlock_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str = scanner.nextLine();
		System.out.println(maxBlock(str));
	}

	/// {write you code here
	public static int maxBlock(String str) throws InterruptedException {
		int maxCounter = 1;
		int counter = 1;
		if (str.isEmpty()) {
			return 0;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i - 1) == str.charAt(i)) {
				if (++counter > maxCounter) {
					maxCounter = counter;
					System.out.println("Counter :" + counter);
					System.out.println("max: " + maxCounter);
					Thread.sleep(500);
				}
			} else {
				counter = 1;
			}
		}

		return maxCounter;
	}

	/// }

}