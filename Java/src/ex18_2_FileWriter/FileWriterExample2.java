/*FileWriter Ŭ������ �̿��ؼ� ���� �����͸� ���Ͽ� ���� ���α׷�
 * java.lang.Object
 * 	java.io.Writer
 * 		java.io.OutputStreamWriter
 * 			java.io.FileWriter
 * 
 * output.txt�� Ȯ���ϴ� ���
 * 1.��Ŭ���� Package Explorer���� Java ������Ʈ���� ���ΰ�ħ(F5) ������ ���
 * 2. ��Ŭ���� Window �޴� - preferences - General - Workspace - Refresh using native hooks or polling ����
 * */
package ex18_2_FileWriter;

import java.io.FileWriter;
import java.io.*;


public class FileWriterExample2 {
	public static void main(String args[]) {
		FileWriter writer = null;
		try {
			// �������� �Ű������� �� ������ �̸��� �ǹ��մϴ�.
			// output.txt������ ���� ���� ���� ���� �� ������ �����ϴ�.
			// ���� �̸��� �ִ� ��� ���� ������ ������ �������ϴ�.

			writer = new FileWriter("output.txt", true);
			// public FileWriter(String fileName)throws IOException
			// FileWriter �����ڴ� IOException������ �߻��ϱ� ������
			// IOException ó������ �־�� �մϴ�.
			
			char arr[] = {'��','��',' ','��','��','��'};
			// ���Ͽ� �ݺ��ؼ� ���ڵ��� ���ϴ�.
			for (int cnt = 0; cnt < arr.length; cnt++)
				writer.write(arr[cnt]);
			writer.write("\n"); //���� �ٲٴ� ���� �߰�
		} catch (IOException ioe) {
			System.out.println("���Ϸ� ����� �� �����ϴ�.");
		}

		finally {
			try {
				writer.close();// ������ �ݽ��ϴ�.
			} catch (Exception e) {
				System.out.println("���� �ݴ� �� �����Դϴ�.");
			}

		}
	}
}