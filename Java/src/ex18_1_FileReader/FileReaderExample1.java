package ex18_1_FileReader;
import java.io.*;
class FileReaderExample1 {
	public static void main(String args[]) {
		// 1.������ ���ϴ�.
		/*
		 * ������ ���ڰ����� ������ ��ġ�� �����մϴ�. ���� ��� : ����ο� ���� ��� ���� 1)����� : ������Ʈ ��θ� �������� ���ʴ��
		 * ������ ��ġ�� �����մϴ�. 2)������ : ����̺����� ���ʴ�� ������ ��ġ�� �����մϴ�. ��) D:/�۾�����/������Ʈ/poem.txt
		 * �ǹ�
		 */
		try {
			FileReader reader = new FileReader("poem.txt");
			//FileReader reader = new FileReader("D:/eclipse-workspace/Java/poem.txt");
			//FileReader reader = new FileReader("D:\\eclipse-workspace\\Java\\poem.txt");
			// ������ ����
			// FileReader reader =
			// new FileReader("D:/workspace_java/java/poem.txt);

			// 2. ������ �о ó���մϴ�.
			while (true) {
				// read() : ���Ͽ� �ִ� ���� �ϳ��� �о �����ϴ� �޼ҵ�
				int data = reader.read();
				if (data == -1)// �� �̻� ���� �����Ͱ� ���� ���
					break;
				char ch = (char) data;
				System.out.print(ch);

			}
			// 3. ������ �ݽ��ϴ�.
			reader.close(); // ���� read()�޼��忡�� ������ �߻��ϸ�
							// close()�޼��尡 ���� ���� ���� ä ���α׷��� �����ϴ�.
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {// read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		}

	}
}