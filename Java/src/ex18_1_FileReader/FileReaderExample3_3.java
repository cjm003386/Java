//텍스트 파일을 읽는 프로그램 - 에러 발생

//FileReader 생성자, read method예외 처리
package ex18_1_FileReader;
import java.io.*;
class FileReaderExample3_3 {
	public static void main(String args[]) {
		// 1.파일을 엽니다.
		/*
		 * 생성자 인자값으로 파일의 위치를 지정합니다. 지정 방법 : 상대경로와 절대 경로 지정 1)상대경로 : 프로젝트 경로를 기준으로 차례대로
		 * 파일의 위치를 지정합니다. 2)절대경로 : 드라이브명부터 차례대로 파일의 위치를 지정합니다. 예) D:/작업폴더/프로젝트/poem.txt
		 * 의미
		 */
		FileReader reader = null;
		try {
			reader = new FileReader("poem2.txt");
			// 2. 파일을 읽어서 처리합니다.
			while (true) {
				// read() : 파일에 있는 문자 하나를 읽어서 리턴하는 메소드
				int data = reader.read();
				if (data == -1)// 더 이상 읽을 데이터가 없는 경우
					break;
				char ch = (char) data;
				System.out.print(ch);
				
			}
			
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용함.
			try {
				
				reader.close(); //파일 닫는 명령문
			}catch (Exception e) { //close 메소드가 발생하는 예외 처리
				System.out.println("Exception"); // IOException과 NullPointerException 처리하기 위한 문장
			}
		}

	}
}
