package Project7;

public class Pizza {
	int price;
	boolean veg;
	int addChees=100;
	int addToopings=150;
	int pack=7;
	boolean isExtracheesadded;
	boolean isExtraToppingadded;
	boolean isOptedforpack;
	int basePizzza;

	public Pizza(boolean veg) {
		this.veg = veg;
		if (this.veg) {
			this.price = 300;
			System.out.println("Veg Pizza");
		} else {
			this.price = 400;
			System.out.println("Non-veg Pizza");
		}
		basePizzza=this.price;
	}

	public void getPizzaPrice() {
		System.out.println(this.price);
	}

	public void addChees() {
		isExtracheesadded=true;
		this.price+=addChees;
	}

	public void addToopings() {
		isExtraToppingadded=true;
		this.price+=addToopings;
	}

	public void takeAway() {
		isOptedforpack=true;
		this.price+=pack;
	}

	public void bill() {
		String bill="";
		
		System.out.println("Pizza Price "+ basePizzza);
		if(isExtracheesadded) {
			bill +="Extra added "+addChees+"\n";
		}
		if(isExtraToppingadded) {
			bill +="Extra Topping "+addToopings+"\n";
		}
		if(isOptedforpack) {
			bill +="Extra Packing "+pack+"\n";
		}
		bill +="Bill :"+ this.price+"\n";
		System.out.println(bill);
	}
}
