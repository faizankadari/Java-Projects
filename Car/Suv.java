package Project9;

public class Suv extends Car{

//	public Suv(String name, int wheels, String type, int doors, int gears, int currentGear, boolean isManual) {
//		super(name, 4, "SUV", 5, 6, currentGear, false);
//		// TODO Auto-generated constructor stub
//	}
	public Suv(String name, boolean isManual) {
		// TODO Auto-generated constructor stub
		super(name, 4, "SUV", 5, 6, false);
	}
	
	public void Accelerate(int rate) {
		int newSpeed = getSpeed()+ rate;
		
		if(newSpeed==0) {
			stop();
			changeGear(1);
		}else if(newSpeed>0 && newSpeed<=10) {
			changeGear(1);
		}else if(newSpeed>10 && newSpeed<=20) {
			changeGear(2);
		}else if(newSpeed>20 && newSpeed<=40) {
			changeGear(3);
		}else if(newSpeed>40 && newSpeed<=70) {
			changeGear(4);
		}else if(newSpeed>70 && newSpeed<=120) {
			changeGear(5);
		}else {
			changeGear(6);
		}
		if(newSpeed>0) {
			changeSpeed(newSpeed,getDirection());
		}
	}

}
