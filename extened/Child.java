package day08;

	public class Child extends Father{//�ڹٴ� ���߻���� �ȵȰ� ���� ��Ӹ� ����
	public Child() {
		super();
		System.out.println("�ڽĻ�����");
	}
		public void childPrint() {
			System.out.println(super.str);//��ȣ�� �����ڸ� �θ��� ������ ��ü�� �θ�
			
			System.out.println("child Print �޼ҵ�");
	}
	public void Test() {
		System.out.println("test method");
	
	}
	


}
