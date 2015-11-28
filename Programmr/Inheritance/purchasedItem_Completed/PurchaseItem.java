package purchasedItem_Completed;

public class PurchaseItem {

	private String name;
	private double unitPrice;

	PurchaseItem(String name, double unitPrice) {
		this.name = name;
		setUnitPrice(unitPrice);
	}

	public double getUnitPrice() {
		return this.unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + "@ " + getUnitPrice();
	}
}
