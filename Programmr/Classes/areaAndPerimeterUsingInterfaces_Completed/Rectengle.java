package areaAndPerimeterUsingInterfaces_Completed;

import java.util.Scanner;

public class Rectengle implements Shape {

	int length;
	int width;

	Rectengle(Scanner sc) {
		System.out.println("Enter the length :");
		this.length = sc.nextInt();
		System.out.println("Enter the width :");
		this.width = sc.nextInt();
	}

	@Override
	public double area() {
		return width * length;
	}

	@Override
	public double peri() {
		return 2 * (width + length);
	}

}
