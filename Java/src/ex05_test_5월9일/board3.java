package ex05_test_5��9��;

import java.util.Scanner;

public class board3 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner (System.in);
		System.out.print("���ڸ� �Է��ϼ���?");
		int inputdata = sc.nextInt();
		int output = (inputdata-1) /  10 * 10;
		System.out.println(output);
		sc.close();
	}


}
