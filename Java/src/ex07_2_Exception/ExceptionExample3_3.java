//checked exception�� ������ �޼���
//������ ���� �߻�
//throws Exception�� ���� �޼��� ȣ��� try~catch������ ó��
package ex07_2_Exception;

public class ExceptionExample3_3 {
	public static void main (String args[]) {
		try {
		   int result = add(1, -2);
		   System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	static int add(int a, int b) throws Exception {
		int result = a + b;
		if (result < 0)
			throw new Exception("0���� �۾� ���� �߻��մϴ�.");
		System.out.println("���� ����� �ɱ��?");
		return result;
	}
	

}
