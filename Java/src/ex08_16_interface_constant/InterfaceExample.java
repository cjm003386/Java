package ex08_16_interface_constant;

public class InterfaceExample {
	public static void main(String args[]) {
		SeparateVolume obj =
				new SeparateVolume("836��", "����", "��������");
		
		//�������� Ȯ���ϰ� ���� ���°� �����ϸ� "���Ⱑ��"�� ����ϰ�
		//�������̸� �����߰� ������, �������� ����մϴ�.
		obj.checkOut("����","2022-06-02");
		
		prinState(obj);
	}

	static void prinState(SeparateVolume obj) {
		//�������̽�, Lendable�� �������� ���� Ŭ���������� ����
		//�������̽�, ���
		
		if(obj.state == Lendable.STATE_NORMAL) {
			System.out.println("===============");
			System.out.println("�������: ���Ⱑ��");
			System.out.println("===============");
		}else if (obj.state == Lendable.STATE_BORROWED) {
			System.out.println("===============");
			System.out.println("�������: ������");
			System.out.println("������:" + obj.borrower);
			System.out.println("������:" + obj.checkOutDate);
		}
		
		
	}

}
