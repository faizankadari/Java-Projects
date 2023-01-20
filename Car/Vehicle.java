package Project9;

public class Vehicle {
	String name;
	int Speed;
	int direction;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSpeed() {
		return Speed;
	}

	public void setSpeed(int speed) {
		Speed = speed;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}

	public Vehicle(String name) {
		Speed = 0;
		direction = 0;
		this.name = name;
	}
	
	public void steer(int direct) {
		direction+=direct;
		System.out.println("Steer method "+direction );
	}
	public void move(int speed, int direct) {
		Speed=speed;
		direction = direct;
		System.out.println("Move Method "+Speed+" In Direction "+ direction);
	}
	public void stop() {
		Speed = 0;
		
	}
}
