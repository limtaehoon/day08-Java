package Allay;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student(1001,"Lee");
		 studentLee.addSubject("����",100);
		 studentLee.addSubject("����",50);
	
		 Student studentkim=new Student(1002,"kim");
		 studentkim.addSubject("����",70);
		 studentkim.addSubject("����",85);
		 studentkim.addSubject("����",100);
	
		 studentLee.showStudentInfo();
	
		 studentkim.showStudentInfo();
	
	
	
	
	
	}

}
