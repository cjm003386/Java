package ex22_4_3;

import java.util.ArrayList;
import java.util.Scanner;

public class CRUD3_menuselect {
	static String menus[] = { "�����ȣ", "����̸�", "����", "�Ŵ���", "�Ի�����"
							, "�޿�", "Ŀ�̼�", "�μ���ȣ", "����" };
	
	public static void main(String[] args) {
		String[] search_word = menuseLect();
		search(search_word);
	}

	

	private static String[] menuseLect() {
		Scanner sc = new Scanner(System.in);
		String search[] = new String[8];
		int i = 0;
		for (String m : menus) {
			System.out.println(++i + "." + m);
		}
		int menu = 0;
		do {
		System.out.println("��ȸ�� �÷��� �����ϼ���>");
		menu = inputNumber(sc);
		if(menu == 9) {
			sc.close();
			break;
		}
		search[menu - 1] = searchData(sc,menu);
	} while (true);
		return search;
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
				System.out.print(lowNumber + "~ " + hiNumber + "������ ���ڸ� �Է��ϼ���");
			}
	}catch(NumberFormatException e) {
		System.out.print("���ڷ� �Է��ϼ���>");
			}
	return input;
	}
	
	private static String searchData(Scanner sc, int menu) {
		System.out.print("��ȸ��" + menus[menu - 1]+ "��(��) �Է��ϼ���>");
		return sc.nextLine();
	}
	
	private static void search(String[] searchword) {
		DAO dao = new DAO();
		ArrayList<Emp> e = dao.search(searchword);

		if (e == null) {
			System.out.println("�˻� ����� �����ϴ�.");
		} else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0], menus[1], menus[2], menus[3],
					menus[4], menus[5], menus[6], menus[7]);
			for (Emp s : e) {
				System.out.println(s.toString());
			}
		}

	}
}
