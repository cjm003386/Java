package ex19_03_Serialization_interface;

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

public class GoodStock_InputStream {
	public static void main(String args[]) {
		ObjectInputStream in = null;
		try {
			in = new ObjectInputStream(new FileInputStream("output2.dat"));
			while (true) {
				GoodsStock obj = (GoodsStock) in.readObject();
				System.out.println(obj.toString());
			}

		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");
			
		} catch (EOFException eofe) {
			System.out.println("끝");
			
		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수 없습니다.");
			
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
