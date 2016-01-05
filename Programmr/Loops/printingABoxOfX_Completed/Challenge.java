package printingABoxOfX_Completed;

import java.util.Scanner;

class Challenge {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter height: ");
		int height = sc.nextInt();

		System.out.print("Enter width: ");
		int width = sc.nextInt();

		/// { write you code here

		for (int i = 1; i <= height; i++) {
			System.out.print("#");
			for (int j = 1; j < width; j++) {
				System.out.print("#");
				if (j == width - 1) {
					System.out.println();
				}
			}
		}

		/// }

	}

}
