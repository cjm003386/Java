//�߻� �޼ҵ忡 throws ���� �߰��� ���� ���� �������̽�
//���� Ŭ�������� throws ���� ����� ���
//�������̽������� trows ���� �ۼ��� �־�� �Ѵ�.
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� ������ �� �����ϴ�.
package ex08_17_interface_exception;

interface Lendable2 {
	final static byte STATE_BORROWED = 1; //���� ��
	final static byte STATE_NORMAL = 0;
	
	abstract void checkOut(String borrower, String date)
		throws Exception;
	abstract void checkIn();

}
