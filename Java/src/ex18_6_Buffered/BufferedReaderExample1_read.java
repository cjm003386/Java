package ex18_6_Buffered;
import java.io.*;
class BufferedReaderExample1_read {
	public static void main(String args[]) {

		BufferedReader reader = null;
		char arr[] = new char[64]; // ���Ͽ� �ִ� ���ڸ� ���� char�迭
		int num = -1;
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered/output2.dat"));

			while ((num = reader.read(arr)) != -1) {
				System.out.print(new String(arr, 0, num));
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {// Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {// ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� �����.
			try {
				reader.close(); // ������ �ݴ� ��ɹ�
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println(e.getStackTrace());
			}

		}
	}
}
