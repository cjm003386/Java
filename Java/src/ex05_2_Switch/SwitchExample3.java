//SwitchExample4.java를 이용해서
//두 개의 정수와 연산자를 입력받아 연산자에 따른 결과 출력하는 프로그램
/*
  정수 1을 입력하세요
  정수 2를 입력하세요
  연산자 +,-,*,/,% 중 한 개 입력하세요>"
  
  단, 연산자가 "+", "-", "*", "/", "%" 이외인 경우
  "+, -, *, /, % 중 한개를 입력하세요"를 출력합니다.
  
 */
package ex05_2_Switch;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수1를 입력하세요");
		int n1 = sc.nextInt();

		System.out.print("정수2를 입력하세요");
		int n2 = sc.nextInt();

		System.out.print("연산자 +, -, *, /, % 중 한 개 입력하세요");

		String ch = sc.next();

		switch (ch) {
		case "+":
			System.out.println(n1 + n2);
			// System.out.println(n1 + ch + n2 + "=" + (n1+n2);
			break;
		case "-":
			System.out.println(n1 - n2);
			break;
		case "*":
			System.out.println(n1 * n2);
			break;
		case "/":
			System.out.println(n1 / (double) n2);
			// System.out.printf("%d %s %d = %.1f\n" , n1, ch, n2, (double)n1/n2);
			break;
		case "%":
			System.out.println(n1 % n2);
			break;
		default:
			System.out.println("\"+\",\"-\",\"*\",\"/\",\"%\" 중 한 개 입력하세요");

			System.out.println("끝.");

		}
		sc.close();
	}

}
