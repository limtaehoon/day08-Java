package Cooperation;

public class Texi {
	String TexiNumder;
	int money;
	public Texi(String TexiNumder) {
		this.TexiNumder=TexiNumder;
	}
 //�ý� Ÿ��
	public void take(int money) {
		
		this.money+=money;
	}
	
	public void showinfo() {
		System.out.println("�ý�"+TexiNumder);
		System.out.println("�ýü���"+money);
	}
}
