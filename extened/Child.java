package day08;

	public class Child extends Father{//자바는 다중상속은 안된고 단일 상속만 가능
	public Child() {
		super();
		System.out.println("자식생성자");
	}
		public void childPrint() {
			System.out.println(super.str);//괄호는 생성자를 부르고 없으면 객체를 부름
			
			System.out.println("child Print 메소드");
	}
	public void Test() {
		System.out.println("test method");
	
	}
	


}
