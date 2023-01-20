package Project5;

public class Teacher {
	String name;
	String id;
	int salary;
	int salaryEarned;
	String sub;

	public Teacher(String name, String id, int salary, String sub) {

		this.name = name;
		this.id = id;
		this.salary = salary;
		this.sub = sub;
		salaryEarned=0;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSub() {
		return sub;
	}
	public void salaryEarned(int salary) {
		School.updateMoneySpent(salary);
		salaryEarned =salaryEarned+ salary;
		
		System.out.println("Salay of " + getName()+" is "+getSalary());
	}
}
