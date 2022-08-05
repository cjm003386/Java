package ex05_1_if;

import java.io.InputStream;
import java.util.Scanner;

public class IfExample6 {
	public static void main(String args[]) {
		System.out.print("수를 입력하세요>");
        InputStream in = System.in;
		Scanner sc = new Scanner(in);
		int s = sc.nextInt();

		if (s >= 95) {
			System.out.println("A+학점");
		} else if (s >= 90) {
			System.out.println("A학점");
		} else if (s >= 85) {
			System.out.println("B+학점");
		} else if (s >= 80) {
			System.out.println("B학점");
		} else if (s >= 75) {
			System.out.println("C+학점");
		} else if (s >= 70) {
			System.out.println("C학점");
		} else if (s >= 65) {
			System.out.println("D+학점");
		} else if (s >= 60) {
			System.out.println("D학점");
		} else {
				System.out.println("F학점");
			}

		sc.close();
	}

}
