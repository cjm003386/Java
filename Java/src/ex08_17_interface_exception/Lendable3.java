//�߻� �޼ҵ忡 throws ���� �߰��� ���� ���� �������̽�
//���� Ŭ�������� throws ���� ����� ���
//�������̽������� trows ���� �ۼ��� �־�� �Ѵ�.
//�θ� Ŭ������ �޼ҵ庸�� �� ū ������ ���ܸ� ������ �� �����ϴ�.
package ex08_17_interface_exception;

import java.io.IOException;

interface Lendable3 {
	final static byte STATE_BORROWED = 1; //���� ��
	final static byte STATE_NORMAL = 0;
	
	abstract void checkOut(String borrower, String date)
		throws IOException;
	abstract void checkIn();

}
