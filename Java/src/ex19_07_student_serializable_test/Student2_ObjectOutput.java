package ex19_07_student_serializable_test;

import java.io.*;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.GregorianCalendar;

public class Student2_ObjectOutput {
	public static void main(String agrs[]) {
		write();
	}

	static void write() {
		BufferedReader reader = null;
		ObjectOutputStream out = null;
		try {
			reader = new BufferedReader(new FileReader("src/ex19_07_student_serializable_test/jumsu.txt"));
			out = new ObjectOutputStream(new FileOutputStream("src/ex19_07_student_serializable_test/output.dat"));
			while (true) {
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ ����
				if (str == null)
					break;
				String[] sep = str.split(" ");
				out.writeObject(new Student2(sep[0], Integer.parseInt(sep[1]), Integer.parseInt(sep[2]),
						Integer.parseInt(sep[3])));
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {
			try {

				out.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}

		}
	}
}
