package Allay;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee=new Student(1001,"Lee");
		 studentLee.addSubject("국어",100);
		 studentLee.addSubject("수학",50);
	
		 Student studentkim=new Student(1002,"kim");
		 studentkim.addSubject("국어",70);
		 studentkim.addSubject("수학",85);
		 studentkim.addSubject("영어",100);
	
		 studentLee.showStudentInfo();
	
		 studentkim.showStudentInfo();
	
	
	
	
	
	}

}
