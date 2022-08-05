//상속 관계에 있는 두 종류의 Exception을 처리하는 try문
package ex12_1_Exception;
import java.io.*;

public class ExceptionExample9_2 {
	public static void main(String args[]) {
		try {
			FileReader reader = new FileReader("some.txt");
			reader.close();
		}catch (IOException e) {
			System.out.println("입출력 에러가 발생했습니다.");
		//이미 부모 IOException에서 자식 FileNotFoundException 도
		//처리할 수 있기 때문에 이 부분이 필요없습니다.
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다.");
		
		}
	}

}
