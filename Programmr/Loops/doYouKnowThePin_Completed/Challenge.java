package doYouKnowThePin_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = 0, pin = 12345, tries = 0;
		/// { write your code here
		while (n != pin) {
			n = scanner.nextInt();
			if (n == pin) {
				System.out.println("PIN ACCEPTED. YOU NOW HAVE ACCESS TO YOUR ACCOUNT");
			} else {
				tries++;
				if (tries == 3) {
					System.out.println("YOU HAVE RUN OUT OF TRIES. ACCOUNT LOCKED.");
					break;
				}
				System.out.println("INCORRECT PIN. TRY AGAIN. ");

			}

		}
		/// }
	}
}
