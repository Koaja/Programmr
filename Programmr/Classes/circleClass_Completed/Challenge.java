package circleClass_Completed;

import java.util.Scanner;

public class Challenge {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		System.out.println("Enter radius:");
		double rad = scanner.nextDouble();
		System.out.println("Enter color:");
		String col = scanner.next();

		myCircle mc = new myCircle(col, rad);

		System.out.println(mc.getArea());
		System.out.println(mc.color);
	}
}

class myCircle {
	/// {write your code here

	String color;
	double radius;

	myCircle(String color, double radius) {
		this.color = color;
		this.radius = radius;
	}

	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}

	/// }
}
