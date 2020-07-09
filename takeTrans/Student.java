package Cooperation;

public class Student {

	private String studentName;
	private int grade;
	private int money;
	public Student(String studentName,int money) {
		this.studentName=studentName;
		this.money=money;
	}
	//버스 타다
		public void takeBus(Bus bus) {
			bus.take(1000);
			this.money-=1000;
				}
		//지하철탐
		public void takeSubway(Subway subway) {
			subway.take(1500);
			this.money-=1500;
		}
		//택시타다
		public void takeTexi(Texi texi) {
			texi.take(30000);
			this.money-=30000;
		}
		public void showInfo() {
			System.out.println("학생이름"+studentName);
		    System.out.println("잔액"+money);
			
	
		}
	
	
	
}
