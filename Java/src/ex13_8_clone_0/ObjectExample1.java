//clone()�޼ҵ�� ��ü�� �����ϴ� ����� �մϴ�.
//��, �Ȱ��� ���� ���� ��ü�� �� �� �� ����ϴ�.
//���� ������ Ŭ������ ���ؼ��� ȣ���� �� �ֽ��ϴ�.


package ex13_8_clone_0;

import java.util.GregorianCalendar;

class ObjectExample1 {
	public static void main(String args[]) {
		//��ü�� �����մϴ�.
		GregorianCalendar obj1 = new GregorianCalendar (2020, 11, 1);
		
		//clone �޼���� ��ü�� �����մϴ�.
		Object imsi = obj1.clone();
		GregorianCalendar obj2 = (GregorianCalendar)imsi;
		//�� �� ������ �� �������� ǥ���ϸ� ������ �����ϴ�.
		//GregorianCalendar obj2 =(GregorianCalendar) obj1.clone();
		
		//%F : ���� ���ڴ� ��¥�� yyyy-MM-dd �������� �����ϴ� ������ �Ѵ�.
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
		
		obj1.set(2021, 5,1);
		System.out.printf("%tF %n", obj1);
		System.out.printf("%tF %n", obj2);
	}
	

}
