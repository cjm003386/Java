package ex19_07_student_serializable_test;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ex19_06_serialVersionUID_no.Rectangle;

public class Student2_ObjectInput {
	public static void main(String args[]) {
		input();
	}

	static void input() {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("src/ex19_07_student_serializable_test/output.dat"));
			while (true) {
				Student2 s = (Student2) in.readObject(); // ��ü�� ������ȭ�ϴ� �κ�
				System.out.println(s.toString());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (EOFException eofe) {
			System.out.println("��");

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("�ش� Ŭ������ �������� �ʽ��ϴ�.");

		} finally {// ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� �����.
			try {
				if (in != null)
					in.close();// ������ �ݴ� ��ɹ�
			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ���� ó��
				System.out.println(e.getStackTrace());
			}

		}
	}
}