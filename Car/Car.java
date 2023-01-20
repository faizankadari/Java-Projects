package Project9;

public class Car extends Vehicle{
	int wheels;
	String type;
	int doors;
	int gears;
	int currentGear;
	boolean isManual;
	
	public Car(String name,int wheels, String type,int doors,int gears,boolean isManual) {
		super(name);
		this.type = type;
		this.doors=doors;
		this.wheels=wheels;
		this.gears=gears;
		this.isManual=isManual;
		currentGear=1;
	}
	
	public void changeGear(int newGear) {
		this.currentGear=newGear;
		System.out.println("Change Gear "+currentGear);
	}
	public void changeSpeed(int newSpeed,int newDirection) {
		move(newSpeed,newDirection);
		System.out.println("Change Speed "+newSpeed+" New Diretion "+newDirection);
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getCurrentGear() {
		return currentGear;
	}

	public void setCurrentGear(int currentGear) {
		this.currentGear = currentGear;
	}

	public boolean isManual() {
		return isManual;
	}

	public void setManual(boolean isManual) {
		this.isManual = isManual;
	}
}
