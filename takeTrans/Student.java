package Cooperation;

public class Student {

	private String studentName;
	private int grade;
	private int money;
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//���� Ÿ��
		public void takeBus(Bus bus) {
			bus.take(1000);
			this.money-=1000;
				}
		//����öŽ
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money-=1500;
		}
		//�ý�Ÿ��
		public void takeTexi(Texi texi) {
			texi.take(30000);
			this.money-=30000;
		}
		public void showInfo() {
			System.out.println("�л��̸�"+studentName);
		    System.out.println("�ܾ�"+money);
			
	
		}
	
	
	
}
