//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try��
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_1 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		}catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
	}

}
