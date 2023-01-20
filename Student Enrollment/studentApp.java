package Project8;

public class studentApp {
	public static void main(String[] args) {
		
		
		Student[] abcd= new Student[5];
		
		for(int i=0;i<=abcd.length;i++) {
			abcd [i]= new Student();
			abcd [i].enroll();
			abcd [i].payTution();
			System.out.println(abcd [i].showInfo());
		}
		
	}
}
