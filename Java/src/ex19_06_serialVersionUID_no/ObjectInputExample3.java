//객체를 역직렬화하는 프로그램
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
				Rectangle obj = (Rectangle) in.readObject(); //객체를 역직렬화하는 부분
				System.out.println(obj);
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch (EOFException eofe) {
			System.out.println("끝");
			
		} catch (IOException ioe) {
			//직렬화할 때 사용한 클래스와 역직렬화할 때 사용한 클래스의 버전이
			//다를 때 발생하는 에러 메시지 출력하는곳
			System.out.println(ioe.getMessage());
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스가 존재하지 않습니다.");
			
		} finally {// 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				in.close(); // 파일을 닫는 명령문
			} catch (Exception e) { // close메소드가 발생하는 예외 처리
				System.out.println(e.getStackTrace());
			}

		}
	}
}
