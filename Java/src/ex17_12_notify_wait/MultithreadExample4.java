/*notify�޼ҵ�� wait�޼ҵ� ��� ��
 * 
 * -������ ���̿� ��ȣ�� ���� �ְ� ���� �� �ֽ��ϴ�.
 * ����ȭ�� ������� ����ȭ ��Ͽ��� �ٸ� �����忡�� ������� �ѱ��� ���մϴ�.
 * �ܿ� ���� ����ȭ�� ��Ͽ��� �����尣�� ���(������� �ѱ�)�ϱ� ���ؼ�
 * wait(), notify(), notifyAll() �޼ҵ带 ����ؾ� �մϴ�.
 * �� �޼ҵ带 ����� ���� synchronized ��Ͽ����� �ǹ̰� �ֽ��ϴ�.
 * */

package ex17_12_notify_wait;

public class MultithreadExample4 {
	public static void main(String args[]) {
		//���� ���� ��ü�� �����ؼ� �� ��ü�� �������� �� �������� �ʵ忡 �����մϴ�.
		SharedArea obj = new SharedArea();
		CalcThread thread1 = new CalcThread(obj);
		PrintThread thread2 = new PrintThread(obj);
		
		thread1.start();
		thread2.start();
	}

}
