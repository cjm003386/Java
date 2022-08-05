package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Student_main_for_method_NumberFormat_Exception {
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
		String pandan = "";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while (!pandan.equalsIgnoreCase("q")) {
			System.out.print("�̸��� �Է��ϼ���>");
			name = sc.nextLine();
			
			System.out.print("���� ������ �Է��ϼ���>");
			kor = isNumber(sc);
			
			System.out.print("���� ������ �Է��ϼ���>");
			math = isNumber(sc);
			
			System.out.print("���� ������ �Է��ϼ���>");
			eng = isNumber(sc);
			
			Student2 h = new Student2(name, kor, math, eng);
			as.add(new Student2(name, kor, math, eng));
			
			System.out.print("����Է��Ͻðڽ��ϱ�?(q �Ǵ� Q�̸� ���� �� �ܴ� ���");
			pandan = sc.nextLine();
		}
		sc.close();
	}

		static int isNumber(Scanner sc) {
			int num;
			while (true) {
				try {
					num = Integer.parseInt(sc.nextLine());
					break;
				} catch (java.lang.NumberFormatException e) {
					System.out.print("���ڷ� �ٽ� �Է��ϼ���>");
				}
			}
			return num;
		}
	

	
		
	

	
	}


