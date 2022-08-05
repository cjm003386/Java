
package ex08_15_01_interface_polymorphism;

//���� ���� �������̽��� �����ϴ� �η� CD Ŭ����

class APPCDInfo extends CDInfo implements Lendable {
	String borrower; // ������
	String checkOutDate; // ������
	byte state; // �������

	APPCDInfo(String registerNo, String title) {
		super(registerNo, title);
	}

	// public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	// �����Ѵ�
	public void checkOut(String borrower, String date) {
		if (state != 0)
			return;
		this.borrower = borrower;
		this.checkOutDate = date;
		this.state = 1;
		System.out.println("*" + title + " CD�� ����Ǿ����ϴ�.");
		System.out.println("������:" + borrower);
		System.out.println("������:" + date + "\n");
	}

//public : �������̽��� �޼ҵ带 ������ �� �ݵ�� ����ؾ� �ϴ� Ű����
	public void checkIn() { // �ݳ��Ѵ�
		this.borrower = null;
		this.checkOutDate = null;
		this.state = 0;
		System.out.println("*" + title + " CD�� �ݳ��Ǿ����ϴ�.\n");
	}

}
