//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҵ� - valueOf
package ex14_1_Wrapper;

public class Wrapper4_valueOf {
	public static void main(String args[]) {
		//Wrapper Ŭ������ �����ڸ� ����ϴ� ���� �޼ҵ�
		//�ڽ� - �⺻�� Ÿ���� ���� ��üȭ
		//int - > Integer
		Integer obj1 = Integer.valueOf(10);
		Integer obj2 = Integer.valueOf(10);
		
		//�Ȱ��� �⺻���� ������ valueOf�޼ҵ带 ���� �� ȣ���ϸ�
		//���� ��ü�� ���� �������� ���ϵ˴ϴ�.
		
		if(obj1==obj2)
			System.out.println("obj1==obj2");
		else
		System.out.println("obj1!=obj2");
		
		//String�� ���������� equals�޼ҵ�� �ּҰ��� �ƴ�
		//������ ���ϵ��� �������̵��Ǿ� �ֽ��ϴ�.
		
		if(obj1.equals(obj2))
			System.out.println("obj1.equals(obj2) ���ƿ�");
		else
			System.out.println("obj1.equals(obj2) �޶��");

	}	
}