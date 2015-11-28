package purchasedItem_Completed;

public class CountedItem extends PurchaseItem {

	private int quantity;

	public CountedItem(String name, double unitPrice, int quantity) {
		super(name, unitPrice);
		this.quantity = quantity;
	}

	public double getPrice() {
		return super.getUnitPrice() * this.quantity;
	}

	public String toString() {
		return super.toString() + " " + this.quantity + " units " + this.getPrice() + " $";
	}
}
