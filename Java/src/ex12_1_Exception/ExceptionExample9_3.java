//상속 관계에 있는 두 종류의 Exception을 처리하는 try문
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_3 {
	public static void main(String args[]) {
		try {
			
			FileReader reader = new FileReader("some.txt");
			reader.close();
	
		//FileNotFoundException은 IOException의 서브 클래스로
			//FileNotFoundException도 잡을 수 있습니다.
		}catch (Exception e) {
			System.err.println("입출력 에러가 발생했습니다.");
		
		}
	}

}
