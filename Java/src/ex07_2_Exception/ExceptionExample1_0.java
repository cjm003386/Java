package ex07_2_Exception;

public class ExceptionExample1_0 {
	public static void main(String args[]) {
		int sum = 1 + -2;
		if(sum < 0) {
			new Exception("���� �߻�"); //Exception ��ü ����
		}
		
		System.out.println(sum);	}

}
