// equals �޼ҵ� ��� �� - �Ȱ��� ���� ���� �� ���� ��ü�� ����

// Object Ŭ���� equals()�޼ҵ�
// �Ű������� ��ü�� ���������� �޾Ƽ� ���Ͽ� �� ����� boolean������
// �˷� �ִ� ������ �մϴ�.
// ������ equals �޼ҵ��� ���� �����Դϴ�.
// public boolean equals(Object arg0) {
//		return this == arg0;

// �� ��ü�� ���� �ٸ��� ���������� ������ �Ǵ��ϰ� �ֽ��ϴ�.
// ���� �ٸ� �� ��ü�� equals�޼���� ���ϸ� �׻� false ����� ��� �˴ϴ�.

package ex13_6_Object_equals;

import java.util.GregorianCalendar;

class ObjcetExample {
	public static void main(String args[]) {
		GregorianCalendar obj1 = new GregorianCalendar(2021, 5, 1);
		GregorianCalendar obj2 = new GregorianCalendar(2021, 5, 1);
		
		System.out.println(obj1);
		System.out.println(obj2);
		
		System.out.println(obj1.toString()); //�������̵� �Ǿ� �ֽ��ϴ�.
		System.out.println(obj2.toString());
		
		if (obj1.equals(obj2))//�������̵� �Ǿ� �ֽ��ϴ�.
			System.out.println("obj1.equals(obj2):����");
		else
			System.out.println("obj1.equals(obj2):�ٸ�");
		
		if(obj1==obj2)
			System.out.println("obj==obj2 : ����");
		else
			System.out.println("obj1==obj2 : �ٸ�");
	}

}
