package ex23_Board_main;
import java.util.Scanner;
public class Board_main2_Insert {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardDAO_seq dao = new BoardDAO_seq();

		do {
			int menu = menuselect(sc);
			switch (menu) {
			case 1:
				insert(sc, dao);
				break;
			
			case 7:
				sc.close();
				return;
			}
		} while (true);
	}
	

	private static void insert(Scanner sc, BoardDAO_seq dao) {
		Board board = new Board();
		System.out.print("작성자>");
		board.setBOARD_NAME(sc.nextLine());
		
		System.out.print("비밀번호>");
		board.setBOARD_PASS(sc.nextLine());
		
		System.out.print("제목>");
		board.setBOARD_SUBJECT(sc.nextLine());
		
		System.out.print("글 내용>");
		board.setBOARD_CONTENT(sc.nextLine());
			
		if(dao.boardInsert(board)==1) {
			System.out.println("글이 작성되었습니다.");
			}else {
				System.out.println("오류가 발생되었습니다.");
			}
		
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
