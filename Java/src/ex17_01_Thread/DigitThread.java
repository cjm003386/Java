package ex17_01_Thread;
/*
 * -java.lang.Thread Ŭ������ �� Ŭ������ ���� Ŭ������
 * Thread(������) Ŭ������� �մϴ�.
 * -�����尡 �� ���� run �޼ҵ� �ȿ� �ۼ��ؾ� �մϴ�.
 * -public void run()�� �������� �ۼ� /�մϴ�.
 * */

public class DigitThread extends Thread {
	//�������̵� - �������̵� ���ص� ������ �����
	//start() �޼ҵ忡 ���� ����˴ϴ�.
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++)
			System.out.print(cnt);
		
		System.out.println("������ �̸�2 : " + Thread.currentThread().getName());
	}

}
