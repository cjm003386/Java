//���� ���� �������̽�
package ex08_14_02_interface;

interface Lendable {
	//�����Ѵ�.
	abstract void checkOut(String borrower, String date);
	
	//�ݳ��Ѵ�.
	abstract void checkIn();
}
