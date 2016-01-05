package primeNumberChallenge_Completed;

class Challenge {

	public static void main(String args[]) {

		System.out.println("Printing prime number from 2 to 20:");
		for (int number = 2; number <= 20; number++) {

			if (isPrime(number)) {
				System.out.println(number + " <");
			} else
				System.out.println(number);
		}

	}

	/// Write your code here{
	public static boolean isPrime(int number) {
		if (number % 2 == 0) {
			return false;
		}

		return true;
	}

	/// }
}
