package books_Completed;

public class NonFiction extends Book {

	public NonFiction(String title) {
		super(title);
		setPrice();
	}

	@Override
	public double setPrice() {
		return super.price = 37.99;
	}
	
	public String toString(){
		return "Title-" + super.title  + " Cost-$" +  super.price;
	}

}
