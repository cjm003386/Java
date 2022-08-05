//상속 관계에 있는 두 종류의 Exception을 처리하는 try문
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_4 {
	public static void main(String args[]) {
		FileReader reader = null;
		try {			
			 reader = new FileReader("some.txt");
			
		} catch (IOException e) {
			System.err.println("입출력 에러가 발생했습니다.");
		} finally {
			
			try {
				
				if( reader != null)
					reader.close();
			} catch (IOException e) {
				System.err.println("파일을 닫는 중 오류 발생했습니다.");
			}
		}
	}

}
