package Project9;

public class Main {
	public static void main(String[] args) {
		Suv fortuner = new Suv("Fortuner",false);
		fortuner.move(40, 0);
		fortuner.Accelerate(50);
		fortuner.Accelerate(20);
		fortuner.Accelerate(10);
		fortuner.Accelerate(-120);
		System.out.println(fortuner.getCurrentGear());
	}
}
