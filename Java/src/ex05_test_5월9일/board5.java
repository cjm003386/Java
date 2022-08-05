package ex05_test_5월9일;

import java.util.Scanner;

public class board5{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
			int page, startpage;
			System.out.println("정수를 입력하세요: ");
			page = sc.nextInt();
			
			startpage = (page - 1) / 10 * 10 + 1;
			System.out.println(startpage);
			
			
		sc.close();
	}
}