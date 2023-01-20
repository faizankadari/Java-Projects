package Project7;

public class DeluxePizza extends Pizza{
	public DeluxePizza(boolean veg) {
		super(veg);
		super.takeAway();
	}

	@Override
	public void addChees() {
	}
// These Two you can't use in these child class
	@Override
	public void addToopings() {
		// TODO Auto-generated me
	}
}
