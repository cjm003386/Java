//Gugudan.txt ���� ����ͷ� �о����.
package ex18_2_FileWriter;

import java.io.*;

public class FilewriterExample4 {
	public static void main(String args[]) {

		try {
			FileReader reader = new FileReader("src/ex18_2_FileWriter/Gugdan.txt");

			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close();
		} catch (FileNotFoundException fnfe) { // FileReader() �����ڰ� �߻��� Exception ó��
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {// read() �޼ҵ尡 �߻��� ���� ó��
			System.out.println("������ ���� �� �����ϴ�.");
		}
	}
}