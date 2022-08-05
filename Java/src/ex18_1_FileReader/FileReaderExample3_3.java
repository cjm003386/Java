//�ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�

//FileReader ������, read method���� ó��
package ex18_1_FileReader;
import java.io.*;
class FileReaderExample3_3 {
	public static void main(String args[]) {
		// 1.������ ���ϴ�.
		/*
		 * ������ ���ڰ����� ������ ��ġ�� �����մϴ�. ���� ��� : ����ο� ���� ��� ���� 1)����� : ������Ʈ ��θ� �������� ���ʴ��
		 * ������ ��ġ�� �����մϴ�. 2)������ : ����̺����� ���ʴ�� ������ ��ġ�� �����մϴ�. ��) D:/�۾�����/������Ʈ/poem.txt
		 * �ǹ�
		 */
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			// 2. ������ �о ó���մϴ�.
			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1)// �� �̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);
				
			}
			
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {// read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		}finally { //������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally ��Ͽ��� �����.
			try {
				
				reader.close(); //���� �ݴ� ��ɹ�
			}catch (Exception e) { //close �޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println("Exception"); // IOException�� NullPointerException ó���ϱ� ���� ����
			}
		}

	}
}
