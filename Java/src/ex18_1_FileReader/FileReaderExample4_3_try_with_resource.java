//�ؽ�Ʈ ������ �д� ���α׷� - ���� �߻�

//FileReader ������, read method���� ó��
package ex18_1_FileReader;
import java.io.*;

class FileReaderExample4_3_try_with_resource {
	public static void main(String args[]) {
		char arr[] = new char[64]; // ���Ͽ� �ִ� ���ڸ� ���� char�迭

		/*
		 * 1. try-with-resource������ try()��ȣ �ȿ� ����� �ڿ��� try���� ���� �� �ڵ����� close()�޼��带 ȣ���մϴ�.
		 * 
		 * 2. try-with-resource���� ���� �ڵ����� ��ü�� close()�� ȣ��� �� �������� Ŭ������ AutoCloseable�̶��
		 * �������̽��� ������ ���̾�� �մϴ�. ����) try(){ ..... }catch(){ }finally{}
		 */

		try (FileReader reader = new FileReader("������ ��.txt");) {
			
			while (true) {
				// Returns : The number of characters read

				int num = reader.read(arr);
				if (num == -1)// �� �̻� ���� �����Ͱ� ���� ��� -1�� �����մϴ�.
					break;
				System.out.print(new String(arr, 0, num));

			} // while end
		} // try end
		catch (FileNotFoundException fnfe) { 
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			System.out.println("final�Դϴ�.");
		}
	}
}

