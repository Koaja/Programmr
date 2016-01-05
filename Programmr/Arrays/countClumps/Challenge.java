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
		int clumps = 0;
		
		for(int i = 0; i < nums.length -1;i++){
			if(nums[i] == nums[i+1]){
				clumps++;
			}
		}
		return clumps;
	}
	/// {Write you code here

	/// }
}


