//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try��
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_3 {
	public static void main(String args[]) {
		try {
			
			FileReader reader = new FileReader("some.txt");
			reader.close();
	
		//FileNotFoundException�� IOException�� ���� Ŭ������
			//FileNotFoundException�� ���� �� �ֽ��ϴ�.
		}catch (Exception e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		
		}
	}

}
