package day08;

public class Main {

	public static void main(String[] args) {
		Father f1=new Father();
		f1.fatherPrint();

		Child c1=new Child();
		//c1.childPrint();
		//f1.methodTest();
		//c1.test();
		//c1.methodTest();
		 GrandFather g1=new GrandFather();//선언과생성
		 c1.grandPrint();
		 f1.grandPrint();	
	GrandFather g2;//선언
	Father f2=new Father();
	g2=f2;//GrandFather=Father
	//f2=g2 컴파일 오류 발생; 강제적으로 명시하면 할수는 있음 
	//g2.fatherPrint();//fatherpoint는 Father 메소드
	g2.grandPrint();//GrandFather메소드가 출력 단.오버라이드 된 메소드는 
	//오버라이딩 된 메소드가 실행된다
	GrandFather g3= new Father();
	/*GrandFather g3
	 * Father f3=new Father();
	 *g3=f3;
	 */
	

	
	
	
	
	}
}
