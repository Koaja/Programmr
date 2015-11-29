package areaAndPerimeterUsingInterfaces_Completed;

import java.util.Scanner;

public class Circle implements Shape {

	int radius;

	Circle(Scanner sc) {
		System.out.println("Enter the radius: ");
		this.radius = sc.nextInt();
	}

	@Override
	public double area() {
		return 3.14 * Math.pow(radius, 2);
	}

	@Override
	public double peri() {
		return 2 * 3.14 * radius;
	}

}
