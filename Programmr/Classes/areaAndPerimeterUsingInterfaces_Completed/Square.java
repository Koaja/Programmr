package areaAndPerimeterUsingInterfaces_Completed;

import java.util.Scanner;

public class Square implements Shape {

	int side;

	Square(Scanner sc) {
		System.out.println("Enter the side :");
		this.side = sc.nextInt();
	}

	@Override
	public double area() {
		return Math.pow(side, 2);
	}

	@Override
	public double peri() {
		return side * 4;
	}

}
