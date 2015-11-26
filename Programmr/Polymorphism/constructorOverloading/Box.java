package constructorOverloading;

public class Box {

	int width;

	int height;

	int depth;

	/// {Write your code here

	Box(int width, int height, int depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	Box() {

	}

	Box(int a) {
		this.width = a;
		this.height = a;
		this.depth = a;
	}

	/// }

	int volume() {

		return width * height * depth;

	}

}
