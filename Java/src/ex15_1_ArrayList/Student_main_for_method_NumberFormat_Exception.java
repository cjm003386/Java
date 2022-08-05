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
		String pandan = "";
		String name;
		int kor, eng, math;
		Scanner sc = new Scanner(System.in);
		while (!pandan.equalsIgnoreCase("q")) {
			System.out.print("이름을 입력하세요>");
			name = sc.nextLine();
			
			System.out.print("국어 점수를 입력하세요>");
			kor = isNumber(sc);
			
			System.out.print("수학 점수를 입력하세요>");
			math = isNumber(sc);
			
			System.out.print("영어 점수를 입력하세요>");
			eng = isNumber(sc);
			
			Student2 h = new Student2(name, kor, math, eng);
			as.add(new Student2(name, kor, math, eng));
			
			System.out.print("계속입력하시겠습니까?(q 또는 Q이면 종료 그 외는 계속");
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
					System.out.print("숫자로 다시 입력하세요>");
				}
			}
			return num;
		}
	

	
		
	

	
	}


