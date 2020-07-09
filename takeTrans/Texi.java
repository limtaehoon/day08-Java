package Cooperation;

public class Texi {
	String TexiNumder;
	int money;
	public Texi(String TexiNumder) {
		this.TexiNumder=TexiNumder;
	}
 //택시 타다
	public void take(int money) {
		
		this.money+=money;
	}
	
	public void showinfo() {
		System.out.println("택시"+TexiNumder);
		System.out.println("택시수입"+money);
	}
}
