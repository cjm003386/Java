package ex05_test_5��9��;

import java.util.Scanner;

public class board4 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ��� : ");
			int inputdata, output;
			inputdata = sc.nextInt();
			
			output = (inputdata - 1) / 10 * 10 + 1;
			System.out.println(output);
	
		sc.close();
	}
}