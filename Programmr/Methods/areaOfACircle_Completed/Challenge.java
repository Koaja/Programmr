package areaOfACircle_Completed;

import java.util.Scanner;

public class Challenge {

	// Constant PI is defined at the class level
	static final double PI = 3.14;

	void getArea() {
		// Method used to calculate area of a circle
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		/// {Write your code here
		
		int radius = scanner.nextInt();
		double area = PI * Math.pow(radius, 2);
		
		/// }
		System.out.print("Area of circle is: " + area);

	}

	public static void main(String args[]) {
		Challenge c1 = new Challenge();
		c1.getArea();

	}
}
