package ex19_03_Serialization_interface;

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

public class GoodStock_InputStream {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println(obj.toString());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
			
		} catch (EOFException eofe) {
			System.out.println("��");
			
		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
			
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");
			
		} finally {// ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� �����.
			try {
				in.close(); // ������ �ݴ� ��ɹ�
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println(e.getStackTrace());
			}

		}
	}
}
