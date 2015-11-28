package books_Completed;

public class Fiction extends Book {

	public Fiction(String title) {
		super(title);
		setPrice();
	}

	@Override
	public double setPrice() {
		return super.price = 24.99;
	}

	public String toString(){
		return "Title-" + super.title  + " Cost-$" +  super.price;
	}
}
