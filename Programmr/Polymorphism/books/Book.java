package books;

public abstract class Book {

	String title;
	double price;

	public Book(String title) {
		this.title = title;
		getTitle();
		getPrice();
	}

	public Book() {

	}

	public String getTitle() {
		return this.title;
	}

	public double getPrice() {
		return this.price;
	}

	public abstract double setPrice();

}
