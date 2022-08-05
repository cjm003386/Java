package ex18_3_1FileinputStream_FileOutputStream;

import java.io.*;

public class FileInputStream_OutputStream_Test_jpg_copy {
	public static void main(String args[]) {
	
		FileInputStream in = null;
		FileOutputStream writer = null;
		try {
			in = new FileInputStream("C:/temp/koala.jpg"); // 파일을 연다.
			writer = new FileOutputStream("C:/temp2/koala_copy.jpg");
			// Run->Run configurations에서 매개변수 값으로 입력

			byte arr[] = new byte[100];// 바이트 단위로 데이터를 읽기 때문에 byte형 사용
			while (true) {
				int readCount = in.read(arr); // 파일로부터 arr(바이트)를 읽는다.
				// int java.io.FileInputStream.read(byte[] b) throws IOException

				if (readCount < 0) // 읽어온 데이터가 -1이면 반복을 중단
					break;

				for (byte i = 0; i < readCount; i++) {
					writer.write(arr[i]);
				}

			}
			System.out.println("복사가 완료되었습니다.");

		} catch (FileNotFoundException fnfe) {
			System.out.println(args[0] + "파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println(args[0] + "파일을 읽을 수 없습니다.");
		} finally {
			try {
				in.close();// 파일을 닫습니다.

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
