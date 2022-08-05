package ex18_6_Buffered;
import java.io.*;
class BufferedWriterExample1_write {
	public static void main(String args[]) {
		String message = "�����Դϴ�. \n���õ� ȭ�����Դϴ�.";

		BufferedWriter writer = null;

		try {
			writer = new BufferedWriter(new FileWriter("src/ex18_6_Buffered/output2.dat"));
			writer.write(message);
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {// Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {// ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ϥ����� �����.
			try {
				writer.close(); // ������ �ݴ� ��ɹ�
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println("�ݴ� �� �����Դϴ�.");
			}
		}
	}

}
