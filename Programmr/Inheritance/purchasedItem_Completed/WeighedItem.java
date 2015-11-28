package purchasedItem_Completed;

public class WeighedItem extends PurchaseItem {

	private double weigth;

	public WeighedItem(String name, double unitPrice, double weigth) {
		super(name, unitPrice);
		this.weigth = weigth;
	}

	public double getPrice() {
		return super.getUnitPrice() * this.weigth;
	}

	public String toString() {
		return super.toString() + " " + this.weigth + " Kg " + this.getPrice() + " $";
	}
}
