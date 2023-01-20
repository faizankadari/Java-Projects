package Project5;

public class Students {
	String name;
	int rollNo;
	int grade;
	int Feespaid;
	int Feestotal;

	public Students(int rollNo, String name, int grade) {
		Feespaid = 0;
		Feestotal = 30000;
		this.rollNo = rollNo;
		this.name = name;
		this.grade = grade;

	}

	public String getName() {
		return name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public int getGrade() {
		return grade;
	}

	public void PayFees(int Fees) {
		School.updateMoneyEarned(Fees);
		Feespaid = Feespaid + Fees;
		if (Feespaid == Feestotal) {
			System.out.println("Already Paid by " + getName() + " i.e " + Fees);
		} else {
			System.out.println("Fees Paid by " + getName() + " is " + Fees);
			System.out.println("Remaining Amount of " + getName() + " is " + (Feestotal - Feespaid));
		}

	}
}
