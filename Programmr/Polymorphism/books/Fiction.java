package books;

public class Fiction extends Book {

	public Fiction(String title) {
		super(title);
	}

	@Override
	public double setPrice() {
		return this.price = 30;
	}

}
