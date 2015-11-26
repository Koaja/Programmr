package areaOfShapes_Completed;

public class Area {

	double a, b, c;

	double area(double a, double b, double c) {
		return (a * b) / 2;
	}

	double area(double r) {
		return 3.14 * Math.pow(r, 2);
	}

	double area(double a, double b) {
		return a * b;
	}
}
