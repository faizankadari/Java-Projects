package Project8;

import java.util.Scanner;

public class Student {
	String firstName;
	String lastName;
	int academicYear;
	String studentId;
	String courses;
	int balance = 0;
	static int costOfCourse = 6000;
	static int id = 1000;

	public Student() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name");
		this.firstName = sc.nextLine();

		System.out.println("Enter Student Last Name");
		this.lastName = sc.nextLine();

		System.out.println("Enter Student Class Level");
		this.academicYear = sc.nextInt();
		System.out.println(" \n Courses Available");
		System.out.println(
				" 1- Java Developer \n 2- Manual Tester \n 3- Automation Tester \n 4- AWS Cloud Arcihtect \n 5- Python Developer");

		setstudentId();
		System.out.println(
				"Name :-" + firstName + " " + lastName + " " + "Year :" + academicYear + " " + "Id :" + studentId);

	}

	private void setstudentId() {
		id++;
		this.studentId = academicYear + "" + id;
	}

	public void enroll() {

		do {

			System.out.println("Type Course Name to Enroll (Press Q to proceed to Payment): ");
			Scanner sc = new Scanner(System.in);
			String course = sc.nextLine();
			if (!course.equals("Q")) {
				if(courses==null) {
					courses=course;
				}else {
				courses = courses +"," +course;
				}
				balance = balance + costOfCourse;

			} else {
				// System.out.println("Visit Again");
				break;
			}

//			System.out.println("Enrolled " + courses);
//			System.out.println("Tution Balance " + balance);
//			

		} while (1 != 0);

	}

	public void viewBalance() {
		System.out.println("Amount left to pay " + balance);
	}

	public void payTution() {
		System.out.print("Enter Payment Amount ");
		Scanner sc = new Scanner(System.in);
		int payment = sc.nextInt();
		balance = balance - payment;
		System.out.println("Thank You for your Payment " + payment);
		viewBalance();
	}

	public String showInfo() {
		return "Name :" + firstName + " " + lastName + " " + "\nCourses Enrolled: " + courses
				+ "\nAmount Pending to pay : $ " + balance;
	}

}
