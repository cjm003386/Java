package ex23_Board_main;

import java.util.Scanner;

public class Board_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			int menu = menuselect(sc);
			System.out.println(menu);
		} while (true);
	}

	private static int menuselect(Scanner sc) {
		String menus[] = { "글쓰기", "수정","답변달기","글삭제","조회","페이지 선정","종료" };
		int i = 0;
		System.out.println("=====================================================");
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("=====================================================");
		System.out.print("메뉴를 선택하세요>");
		return inputNumber(sc, 1, menus.length);
	}

	private static int inputNumber(Scanner sc, int start, int end) {
		int input = 0;
		while (true)
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= end && input >= start) {
					break;
				} else {
					System.out.print(start + "~ " + end + "사이의 숫자를 입력하세요");
				}
			} catch (NumberFormatException e) {
				System.out.print("숫자로 입력하세요>");
			}
		return input;
	}
}
