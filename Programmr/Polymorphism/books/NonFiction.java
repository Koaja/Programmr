package books;

public class NonFiction extends Book {

	public NonFiction(String title) {
		super(title);
	}

	@Override
	public double setPrice() {
		return this.price = 320;
	}

}
