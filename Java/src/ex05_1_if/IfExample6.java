package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample6 {
	public static void main(String args[]) {
		System.out.print("���� �Է��ϼ���>");
        InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int s = sc.nextInt();

		if (s >= 95) {
			System.out.println("A+����");
		} else if (s >= 90) {
			System.out.println("A����");
		} else if (s >= 85) {
			System.out.println("B+����");
		} else if (s >= 80) {
			System.out.println("B����");
		} else if (s >= 75) {
			System.out.println("C+����");
		} else if (s >= 70) {
			System.out.println("C����");
		} else if (s >= 65) {
			System.out.println("D+����");
		} else if (s >= 60) {
			System.out.println("D����");
		} else {
				System.out.println("F����");
			}

		sc.close();
	}

}
