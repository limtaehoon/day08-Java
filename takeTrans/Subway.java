package Cooperation;

public class Subway {
	private String SubNumber;
	private int passengerCount;
	private int money;
	public Subway (String SubNumber) {
		this.SubNumber=SubNumber;
	}
	//�°��� ���� ���� ž��
		public void take(int money) {
			this.money+=
					passengerCount++;
		}
		public void showInfo() {
			System.out.println("����ö"+SubNumber);
		    System.out.println("�°�"+passengerCount);
			System.out.println("����"+money);
		}
}