//SwitchExample4.java�� �̿��ؼ�
//�� ���� ������ �����ڸ� �Է¹޾� �����ڿ� ���� ��� ����ϴ� ���α׷�
/*
  ���� 1�� �Է��ϼ���
  ���� 2�� �Է��ϼ���
  ������ +,-,*,/,% �� �� �� �Է��ϼ���>"
  
  ��, �����ڰ� "+", "-", "*", "/", "%" �̿��� ���
  "+, -, *, /, % �� �Ѱ��� �Է��ϼ���"�� ����մϴ�.
  
 */
package ex05_2_Switch;

import java.util.Scanner;

public class SwitchExample3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����1�� �Է��ϼ���");
		int n1 = sc.nextInt();

		System.out.print("����2�� �Է��ϼ���");
		int n2 = sc.nextInt();

		System.out.print("������ +, -, *, /, % �� �� �� �Է��ϼ���");

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
			System.out.println("\"+\",\"-\",\"*\",\"/\",\"%\" �� �� �� �Է��ϼ���");

			System.out.println("��.");

		}
		sc.close();
	}

}
