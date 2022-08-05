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
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ �о��.
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
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {// Exception - IOException
			System.out.println("������ ���� �� �����ϴ�.");
		} finally {// ������ �ݴ� ��ɹ��� ������ ������� ó���ϱ� ���� finally��Ͽ��� �����.
			try {
				if (reader != null)
					reader.close();
			} catch (Exception e) {
				System.out.println("������ �ݴ� �� �����Դϴ�.");
			}

		}
	}
}
