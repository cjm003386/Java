//���� ���� obj�� �ʱ�ȭ ���� �ʾ� ������ ���� �߻�
//����� ���� �߻�(��Ÿ�� ���� �߻�)
package ex09_02_null;

public class RefTypeExample6 {
	public static void main(String args[]) {
		Point obj = null;
	try {
		System.out.println(obj.x);
		System.out.println(obj.y);
	}catch(NullPointerException n) {
		System.out.println("Point�� null �Դϴ�.");
		
		}

	}
}
