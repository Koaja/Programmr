package swappingElements_Completed;

import java.util.Scanner;

public class Challenge {

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int[] input = new int[5];

		// ask for 5 numbers
		System.out.println("Enter integers");
		for(int i = 0; i < input.length;i++){
			input[i] = scanner.nextInt();
		}
		
		// swap algo here
		for(int i = 0; i < input.length - 1; i+=2){
			int temp = input[i];
			input[i] = input[i+1];
			input[i+1]=temp;
		}
		
		// print them
		for(int i = 0; i < input.length;i++){
			System.out.println(input[i]);
		}
/// { write you code here

		/// }

	}

}