package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample5 {
	public static void main(String args[]) {
		System.out.print("���� �Է��ϼ���>");

		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int num = sc.nextInt();

		if (num < 10) {
			System.out.println("num�� ���� 10 �̸��Դϴ�.");
		} else if (num >= 10 && num < 100) {
			System.out.println("num�� ���� 10 �̻�, 100 �̸��Դϴ�.");
		} else if (num >= 100 && num < 1000) {
			System.out.println("num�� ���� 100 �̻�, 1000 �̸��Դϴ�.");
		} else {
			System.out.println("num�� ���� 1000 �̻��Դϴ�.");
		}
		sc.close();
	}
}
