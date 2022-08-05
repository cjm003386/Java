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
				Student2 s = (Student2) in.readObject(); // 객체를 역직렬화하는 부분
				System.out.println(s.toString());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (EOFException eofe) {
			System.out.println("끝");

		} catch (IOException ioe) {

			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");

		} finally {// 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				if (in != null)
					in.close();// 파일을 닫는 명령문
			} catch (Exception e) { // close메소드가 발생하는 예외 처리
				System.out.println(e.getStackTrace());
			}

		}
	}
}