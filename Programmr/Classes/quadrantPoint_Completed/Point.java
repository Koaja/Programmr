package quadrantPoint_Completed;

public class Point {

	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int quadrant() {
		if (x > 0 && y > 0) {
			return 1;
		} else if (x < 0 && y > 0) {
			return 2;
		} else if (x < 0 && y < 0) {
			return 3;
		} else if (x > 0 && y < 0) {
			return 4;
		}
		return 0;
	}
}
