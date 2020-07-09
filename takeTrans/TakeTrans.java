package Cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("홍길동",5000);
		Student s2=new Student("이순신",10000);
	
		
	Bus bus =new Bus(100);
		s1.takeBus(bus);
		Subway subway=new Subway("2호선");
	//s2학생이 2호선 지하철을 탄다
		s2.takeSubway(subway);
		s1.showInfo();
		s2.showInfo();
	bus.showInfo();
	subway.showInfo();
	
	Student s3=new Student("Edwarld",30000);
	Texi texi=new Texi("택시 회사");
	s3.takeTexi(texi);
	s3.showInfo();
	texi.showinfo();	
	}
}
