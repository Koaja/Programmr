package flipPoint_Completed;

public class Point {

	private int x;
	private int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void flip() {
		int temp = 0;
		
		temp = x;
	
		x = y;
		System.out.println("x coordinate " + x);
		y = temp;
		System.out.println("y coordinate " + y);
	}
}
