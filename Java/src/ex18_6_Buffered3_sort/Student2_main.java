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

	// ����ϱ�
	static void print(ArrayList<Student2> as) {
		System.out.println("===========    �л���   /   ����   ����   ���ϱ�    ===========");
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		for (int i = 0; i < as.size(); ++i) {
			System.out.println(as.get(i).toString());
		}
		for (int j = 0; j < 51; j++) {
			System.out.print("=");
		}

		System.out.print("\n����\t");
		System.out.print(Student2.korTotal + "\t");
		System.out.print(Student2.mathTotal + "\t");
		System.out.print(Student2.engTotal);

	}

	static void input(ArrayList<Student2> as) {
		BufferedReader reader = null;

		try {
			reader = new BufferedReader(new FileReader("src/ex18_6_Buffered3_sort/jumsu.txt"));
			while (true) {
				String str = reader.readLine();// ���Ϸ� ���� �� �྿ �о��.
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
