package Cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student("ȫ�浿",5000);
		Student s2=new Student("�̼���",10000);
	
		
	Bus bus =new Bus(100);
		s1.takeBus(bus);
		Subway subway=new Subway("2ȣ��");
	//s2�л��� 2ȣ�� ����ö�� ź��
		s2.takeSubway(subway);
		s1.showInfo();
		s2.showInfo();
	bus.showInfo();
	subway.showInfo();
	
	Student s3=new Student("Edwarld",30000);
	Texi texi=new Texi("�ý� ȸ��");
	s3.takeTexi(texi);
	s3.showInfo();
	texi.showinfo();	
	}
}
