package day08;

	public class Father extends GrandFather{
	 String str="�ƹ���";
	 public Father() {
		 System.out.println(str+"������");
	 
	 }
	 public Father(String msg) {
		 
		 System.out.println(msg);
	 }
	 public void fatherPrint() {
		 System.out.println("father print�޼ҵ�");
	 }
		 public void methodTest() {
				System.out.println("test method");
		 }
		 //�������̵�(�޼ҵ� �������̵�) :��ӹ������� �ٽ� �ڱⰪ�� ���� �ٲٴ°�
		 
				
	public void grandPrint() {

			 		System.out.println("�Ҿƹ��� grandPrint �޼ҵ带 father�� ������");
 
 
 
 
 }
}
