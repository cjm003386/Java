//텍스트 파일을 읽는 프로그램 - 에러 발생

//FileReader 생성자, read method예외 처리
package ex18_1_FileReader;
import java.io.*;
class FileReaderExample4_2 {
	public static void main(String args[]) {
		FileReader reader = null;
		char arr[] = new char[64]; //파일에 있는 문자를 담을 char배열
		try {
			reader = new FileReader("거위의 꿈.txt");
			
			// 2. 파일을 읽어서 처리합니다.
			while (true) {
				//Returns : The number of characters read
				//arr의 배열 크기 만큼 문자를 읽어 arr에 저장한 후 읽은 개수를 반환합니다.
				int num = reader.read(arr);
				if (num == -1)// 더 이상 읽을 데이터가 없는 경우 -1을 리턴합니다.
					break;
				
				//arr의 0부터 num개 만큼 스트링으로 만든 후 출력
				System.out.println(new String(arr, 0 , num));
				
				
			}//while end
			
		} // try end
		catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}finally { //파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally 블록에서 사용함.
			try {
				
				reader.close(); //파일 닫는 명령문
			}catch (Exception e) { //close 메소드가 발생하는 예외 처리
				System.out.println("Exception"); // 
			}
		}

	}
}
