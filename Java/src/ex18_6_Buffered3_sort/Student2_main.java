package ex18_6_Buffered3_sort;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student2_main {
	public static void main(String args[]) {
		ArrayList<Student2> as = new ArrayList<Student2>();
		input(as);
		Student2.sort(as);
		print(as);
	}

	// 출력하기
	static void print(ArrayList<Student2> as) {
		System.out.println("===========    학생별   /   과목별   총점   구하기    ===========");
		System.out.println("이름\t국어\t수학\t영어\t총점\t평균");
		for (int i = 0; i < as.size(); ++i) {
			System.out.println(as.get(i).toString());
		}
		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}

		System.out.print("\n총점\t");
		System.out.print(Student2.korTotal + "\t");
		System.out.print(Student2.mathTotal + "\t");
		System.out.print(Student2.engTotal);

	}

	static void input(ArrayList<Student2> as) {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();// 파일로 부터 한 행씩 읽어요.
				if (str == null)
					break;
				

				StringTokenizer stok = new StringTokenizer(str);
				String name = stok.nextToken();
				int kor = Integer.parseInt(stok.nextToken());
				int math = Integer.parseInt(stok.nextToken());
				int eng = Integer.parseInt(stok.nextToken());

				as.add(new Student2(name, kor, math, eng));
			

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
