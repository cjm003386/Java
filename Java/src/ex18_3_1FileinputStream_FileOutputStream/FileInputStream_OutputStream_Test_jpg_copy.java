package ex18_3_1FileinputStream_FileOutputStream;

import java.io.*;

public class FileInputStream_OutputStream_Test_jpg_copy {
	public static void main(String args[]) {
	
		FileInputStream in = null;
		FileOutputStream writer = null;
		try {
			in = new FileInputStream("C:/temp/koala.jpg"); // ������ ����.
			writer = new FileOutputStream("C:/temp2/koala_copy.jpg");
			// Run->Run configurations���� �Ű����� ������ �Է�

			byte arr[] = new byte[100];// ����Ʈ ������ �����͸� �б� ������ byte�� ���
			while (true) {
				int readCount = in.read(arr); // ���Ϸκ��� arr(����Ʈ)�� �д´�.
				// int java.io.FileInputStream.read(byte[] b) throws IOException

				if (readCount < 0) // �о�� �����Ͱ� -1�̸� �ݺ��� �ߴ�
					break;

				for (byte i = 0; i < readCount; i++) {
					writer.write(arr[i]);
				}

			}
			System.out.println("���簡 �Ϸ�Ǿ����ϴ�.");

		} catch (FileNotFoundException fnfe) {
			System.out.println(args[0] + "������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println(args[0] + "������ ���� �� �����ϴ�.");
		} finally {
			try {
				in.close();// ������ �ݽ��ϴ�.

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
