package ex05_2_Switch;

import java.io.InputStream;
import java.util.Scanner;

public class Homework {
	public static void main(String args[]) {
		System.out.print("���� �Է��ϼ���>");
		InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int s = sc.nextInt();

		switch (s / 10) {

		case 10:
			System.out.println("A+" + "����");
			break;

		case 9:
			System.out.println("A" + (s % 10 >= 5 ? "+" : "") + "����");
			break;

		case 8:
			System.out.println("B" + (s % 10 >= 5 ? "+" : "") + "����");
			break;

		case 7:
			System.out.println("C" + (s % 10 >= 5 ? "+" : "") + "����");
			break;

		case 6:
			System.out.println("D" + (s % 10 >= 5 ? "+" : "") + "����");
			break;

		default:
			System.out.println("F����");

		}

		sc.close();

	}

}

