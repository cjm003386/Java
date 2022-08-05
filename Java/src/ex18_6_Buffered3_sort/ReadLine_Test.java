package ex18_6_Buffered3_sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ReadLine_Test {
	public static void main(String args[]) {
		BufferedReader reader = null;
	
		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();// 파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				System.out.println(str);
				
				StringTokenizer stok=new StringTokenizer(str);
				String name = stok.nextToken();
				int kor = Integer.parseInt(stok.nextToken());
				int math =Integer.parseInt(stok.nextToken());
				int eng = Integer.parseInt(stok.nextToken());
				
				
				
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (IOException ioe) {// Exception - IOException
			System.out.println("파일을 읽을 수 없습니다.");
		} finally {// 파일을 닫는 명령문을 에러와 상관없이 처리하기 위해 finally블록에서 사용함.
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				System.out.println("파일을 닫는 중 오류입니다.");
			}

		}
	}
}
