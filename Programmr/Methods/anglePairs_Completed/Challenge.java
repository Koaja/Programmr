package anglePairs_Completed;

import java.util.Scanner;

public class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int x, y, z;
		boolean s;
		System.out.println("Enter any three angles:");
		x = scanner.nextInt();
		y = scanner.nextInt();
		z = scanner.nextInt();
		s = anglePairs(x, y, z);
		System.out.println("anglePairs(" + x + " " + y + " " + z + ") has complementary and supplementary angles:" + s);
	}

	/// {write you code here
	public static boolean anglePairs(int angle1, int angle2, int angle3) {
		int a = angle1 + angle2;
		int b = angle1 + angle3;
		int c = angle2 + angle3;

		return (a == 90 && b == 180) || (a == 180 && b == 90) || (a == 90 && c == 180) || (a == 180 && b == 90)
				|| (b == 90 && c == 180) || (b == 180 && c == 90);

		
	}
	/// }

}
