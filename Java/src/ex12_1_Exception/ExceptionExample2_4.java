//�ڹٿ����� ���൵�߿� �߻��ϴ� ����(��Ÿ�� ����)�� ����(Error)�� ����(Exception)�� ������
//Error : ���α׷� �ڵ忡 ���� ������ �� ���� �ɰ��� ����
//Exception : ���α׷� �ڵ忡 ���� ������ �� �ִ� �ټ� �̾��� ����

//Exception�� �Ͼ�� ��Ȳ
//(1) ������ 0���� ������ ���
//(2) �迭�� index���� ���� ���� �����ų� ������ ����� ���
//(3) �������� ����ȯ
//(4) ������ϱ� ���� ������ �������� �ʴ� ���
//(5) �޼ҵ� ȣ���

//unchecked exception�� �ش� - ������ ���� ����
//����� ���� �߻� -���� �߻�
package ex12_1_Exception;

public class ExceptionExample2_4 {
	public static void main(String args[]) {
		
		int num1 = 3, num2 = 0;
		
		try {
		int result = num1 / num2;
		System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.println(message);
			}finally {
				System.out.println("finally���� �Ծ��~");
			}
		
		
		}

}