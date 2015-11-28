package methodOverriding_Completed;

public class B extends A {

	int k;

	B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	
	@Override
	void show(){
		System.out.println(k);
	}
}
