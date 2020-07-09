package Cooperation;

public class Subway {
	private String SubNumber;
	private int passengerCount;
	private int money;
	public Subway (String SubNumber) {
		this.SubNumber=SubNumber;
	}
	//½Â°´ÀÌ µ·À» ³»°í Å¾½Â
		public void take(int money) {
			this.money+=
					passengerCount++;
		}
		public void showInfo() {
			System.out.println("ÁöÇÏÃ¶"+SubNumber);
		    System.out.println("½Â°´"+passengerCount);
			System.out.println("¼öÀÔ"+money);
		}
}