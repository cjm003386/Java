//Gugudan.txt 파일 모니터로 읽어오기.
package ex18_2_FileWriter;

import java.io.*;

public class FilewriterExample4 {
	public static void main(String args[]) {

		try {
			FileReader reader = new FileReader("src/ex18_2_FileWriter/Gugdan.txt");

			while (true) {
				int data = reader.read();
				if (data == -1)
					break;
				char ch = (char) data;
				System.out.print(ch);
			}
			reader.close();
		} catch (FileNotFoundException fnfe) { // FileReader() 생성자가 발생한 Exception 처리
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {// read() 메소드가 발생한 예외 처리
			System.out.println("파일을 읽을 수 없습니다.");
		}
	}
}