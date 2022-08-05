//��� ���迡 �ִ� �� ������ Exception�� ó���ϴ� try��
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_4 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {			
			 reader = new FileReader("some.txt");
			
		} catch (IOException e) {
			System.err.println("����� ������ �߻��߽��ϴ�.");
		} finally {
			
			try {
				
				if( reader != null)
					reader.close();
			} catch (IOException e) {
				System.err.println("������ �ݴ� �� ���� �߻��߽��ϴ�.");
			}
		}
	}

}
