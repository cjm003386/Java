/*CalcThread�� ���� ���� ���� ���� ������ ���⵵ ����
 * PrintThread�� ���� ������ �����͸� �о� ���� ������
 * result �ʵ尡 ������ �ִ� �⺻�� 0.0�� ��µ� ���Դϴ�.
 * �ذ�å?
 *
 * */

package ex17_07_SharedArea_solution;

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
