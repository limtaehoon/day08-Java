package day08;

	public class Father extends GrandFather{
	 String str="아버지";
	 public Father() {
		 System.out.println(str+"생성자");
	 
	 }
	 public Father(String msg) {
		 
		 System.out.println(msg);
	 }
	 public void fatherPrint() {
		 System.out.println("father print메소드");
	 }
		 public void methodTest() {
				System.out.println("test method");
		 }
		 //오버라이드(메소드 오버라이딩) :상속받은것을 다시 자기값에 맞춰 바꾸는것
		 
				
	public void grandPrint() {

			 		System.out.println("할아버지 grandPrint 메소드를 father이 수정함");
 
 
 
 
 }
}
