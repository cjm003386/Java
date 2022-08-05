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
		System.out.print("�ۼ���>");
		board.setBOARD_NAME(sc.nextLine());
		
		System.out.print("��й�ȣ>");
		board.setBOARD_PASS(sc.nextLine());
		
		System.out.print("����>");
		board.setBOARD_SUBJECT(sc.nextLine());
		
		System.out.print("�� ����>");
		board.setBOARD_CONTENT(sc.nextLine());
			
		if(dao.boardInsert(board)==1) {
			System.out.println("���� �ۼ��Ǿ����ϴ�.");
			}else {
				System.out.println("������ �߻��Ǿ����ϴ�.");
			}
		
	}


	private static int menuselect(Scanner sc) {
		String menus[] = { "�۾���", "����","�亯�ޱ�","�ۻ���","��ȸ","������ ����","����" };
		int i = 0;
		System.out.println("=====================================================");
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		System.out.println("=====================================================");
		System.out.print("�޴��� �����ϼ���>");
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
					System.out.print(start + "~ " + end + "������ ���ڸ� �Է��ϼ���");
				}
			} catch (NumberFormatException e) {
				System.out.print("���ڷ� �Է��ϼ���>");
			}
		return input;
	}

}
