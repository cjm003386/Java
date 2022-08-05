
package ex08_15_02_interface_polymorphism_arry;

//���� ���� �������̽��� �����ϴ� �η� CD Ŭ����

class APPCDInfo extends CDInfo implements Lendable {
	String borrower; // ������
	String checkOutDate; // ������
	byte state; // �������
	String writer; //�߰��� �κ�

	APPCDInfo(String registerNo, String title, String writer) { //�߰��� �κ�
		super(registerNo, title);
		this.writer = writer; //�߰��� �κ�
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
		System.out.println("��  ��: " + writer); //�߰��� �κ�
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
