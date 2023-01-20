package Project5;

import java.util.List;

public class School {
	List<Teacher> teachers;
	List<Students> students;
	static int moneyEarned;
	static int moneySpent;
	static int total;
	
	
	
	public School(List<Teacher> teachers, List<Students> students) {
		
		this.teachers = teachers;
		this.students = students;
		moneyEarned=0;
		moneySpent=0;
				
	}


	public List<Teacher> getTeacher() {
		return teachers;
	}


	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}


	public List<Students> getStudent() {
		return students;
	}


	public void addStudent(Students student) {
		students.add(student);
	}


	public static int getMoneyEarned() {
		return total;
	}


	public static void updateMoneyEarned(int moEarned) {
		moneyEarned +=moEarned;
		total=moneyEarned;
	}


	public static int getMoneySpent() {
		return moneySpent;
	}


	public static void updateMoneySpent(int moSpent) {
		moneySpent = total - moSpent; 
		
//		moneySpent = moneyEarned
		//both are same
		//moneyEarned -= moSpent;
	}
	
	
}
