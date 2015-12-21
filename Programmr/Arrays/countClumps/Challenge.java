package countClumps;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		System.out.println("Enter values into the array:");
		for (int i = 0; i < nums.length; i++) {
			nums[i] = scanner.nextInt();
		}
		System.out.println("Clumps:" + countClumps(nums));

	}

	public static int countClumps(int[] nums) {
		return 0;
	}
	/// {Write you code here

	/// }
}
