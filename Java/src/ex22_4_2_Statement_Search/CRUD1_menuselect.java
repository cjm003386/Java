package ex22_4_2_Statement_Search;

import java.util.Scanner;

public class CRUD1_menuselect {
	static String menus[] = { "사원번호", "사원이름", "직급", "매니저", "입사일자"
							, "급여", "커미션", "부서번호", "종료" };
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = menuselect(sc);
		System.out.println(menu);
		sc.close();

	}

	private static int menuselect(Scanner sc) {
		int i = 0;
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("조회할 컬럼을 선택하세요>");
		return inputNumber(sc);
	}

	private static int inputNumber(Scanner sc) {
		int input= 0;
		int lowNumber = 1;
		int hiNumber = menus.length; //9
		
		while (true) 
			try {
				input = Integer.parseInt(sc.nextLine());
				if (input <= hiNumber && input >= lowNumber) {
					break;
			}else {
				System.out.print(lowNumber + "~ " + hiNumber + "사이의 숫자를 입력하세요");
			}
	}catch(NumberFormatException e) {
		System.out.print("숫자로 입력하세요>");
			}
	return input;
	}
}
