//unchecked exception�� �ش� - ������ ���� ����
//����� ���� �߻� - ���� �߻�
package ex07_2_Exception;

public class ExceptionExample2_3 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
		int result = num1 / num2;
		System.out.println(result);
		}catch(ArithmeticException e) {
		  //ArithmeticException��ü�� �ִ� ���� �޽����� �����ɴϴ�.
			String message = e.getMessage();
			System.out.print(message);
		}
	}

}
