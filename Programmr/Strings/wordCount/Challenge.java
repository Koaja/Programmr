package wordCount;

import java.util.Scanner;

class Challenge {
	public static void main(String[] args) {
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String :");
		s = sc.nextLine();
		// {write your code here
		String[] array = s.split(" ");
		int m = array.length;

		int len[] = new int[m];

		for (int j = 0; j < len.length; j++) {
			len[j] = array[j].length();

		}

		System.out.println(len);

		// }
		System.out.println("The word count is -");
		for (int i = 0; i < m; i++)
			System.out.println("No. of words of length " + len[i]); // + " are "
																	// +
																	// count[i]
																	// + ".");
	}
}