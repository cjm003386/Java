//checked exception�� �ش� - ������ ���� �߻�
//�ذ�å : try~catch ������ ó�� �Ǵ� �޼��� ������ ����
package ex07_2_Exception;

public class ExceptionExample1_2 {
	public static void main(String args[]) {
		int sum = 1 + -2; // 1+2; >>> catch �� �������� ��
		try {
			if (sum < 0) {
				throw new Exception("���� �߻�");
			}

			System.out.println(sum);
		} catch (Exception e) {
			System.out.println("[catch]" + e.getMessage());
		}
		
	}
}
