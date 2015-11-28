package userSuper_Completed;

public class Banana extends Apple {

	int number_of_items;

	Banana(int numberOfApples, int numberOfBananas) {
		super.number_of_items = numberOfApples;
		this.number_of_items = numberOfBananas;
	}

	void show() {
		System.out.println("Number of apples:" + super.number_of_items);
		System.out.println("Number of bananas:" + this.number_of_items);
	}
}
