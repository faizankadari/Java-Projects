package Project5;

import java.util.ArrayList;
import java.util.List;


public class MainCls {
	public static void main(String[] args) {
		
	
	Teacher Lizzy= new Teacher("Lizzy","1",5000,"Hindi");
	Teacher Mellisa= new Teacher("Mellisa","2",5300,"English");
	Teacher Tom= new Teacher("Tom","3",4300,"Science");

	List<Teacher> teacherList = new ArrayList<>();
	teacherList.add(Mellisa);
	teacherList.add(Tom);
	teacherList.add(Lizzy);
	
	
	Students Samara= new Students(01,"Samara",7);
	Students Tamasha= new Students(01,"Tamasha",8);
	Students Ray= new Students(01,"Ray",9);

	List <Students> studentList =new ArrayList<>();
	studentList.add(Samara);
	studentList.add(Tamasha);
	studentList.add(Ray);
	
	
	School abc = new School(teacherList,studentList);
	System.out.println("School got $ "+abc.getMoneyEarned());
	
	Samara.PayFees(20000);
	Ray.PayFees(30000);
	Tamasha.PayFees(25000);
	System.out.println("Total Money Earned is "+abc.getMoneyEarned());
	
	Lizzy.salaryEarned(Lizzy.getSalary());
	Mellisa.salaryEarned(Mellisa.getSalary());
	Tom.salaryEarned(Tom.getSalary());
	System.out.println("Total Earned "+abc.getMoneyEarned());
	
	System.out.println("Money "+abc.getMoneySpent());
	}
}
