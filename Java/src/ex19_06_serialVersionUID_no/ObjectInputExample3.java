//��ü�� ������ȭ�ϴ� ���α׷�
package ex19_06_serialVersionUID_no;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;

class ObjectInputExample3  {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output10.dat"));
			while (true) {
				Rectangle obj = (Rectangle) in.readObject(); //��ü�� ������ȭ�ϴ� �κ�
				System.out.println(obj);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (EOFException eofe) {
			System.out.println("��");
			
		} catch (IOException ioe) {
			//����ȭ�� �� ����� Ŭ������ ������ȭ�� �� ����� Ŭ������ ������
			//�ٸ� �� �߻��ϴ� ���� �޽��� ����ϴ°�
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
			
		} finally {// ������ �ݴ� ���ɹ��� ������ ������� ó���ϱ� ���� finally���Ͽ��� �����.
			try {
				in.close(); // ������ �ݴ� ���ɹ�
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println(e.getStackTrace());
			}

		}
	}
}