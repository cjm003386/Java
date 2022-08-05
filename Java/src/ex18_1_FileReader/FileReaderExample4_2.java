//�ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�

//FileReader ������, read method���� ó��
package ex18_1_FileReader;
import java.io.*;
class FileReaderExample4_2 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char[64]; //���Ͽ� �ִ� ���ڸ� ���� char�迭
		try {
			reader = new FileReader("������ ��.txt");
			
			// 2. ������ �о ó���մϴ�.
			while (true) {
				//Returns : The number of characters read
				//arr�� �迭 ũ�� ��ŭ ���ڸ� �о� arr�� ������ �� ���� ������ ��ȯ�մϴ�.
				int num = reader.read(arr);
				if (num == -1)// �� �̻� ���� �����Ͱ� ���� ��� -1�� �����մϴ�.
					break;
				
				//arr�� 0���� num�� ��ŭ ��Ʈ������ ���� �� ���
				System.out.println(new String(arr, 0 , num));
				
				
			}//while end
			
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {// read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		}finally { //������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally ��Ͽ��� �����.
			try {
				
				reader.close(); //���� �ݴ� ��ɹ�
			}catch (Exception e) { //close �޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println("Exception"); // 
			}
		}

	}
}
