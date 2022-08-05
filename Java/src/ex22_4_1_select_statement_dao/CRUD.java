package ex22_4_1_select_statement_dao;

import java.util.ArrayList;

//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����մϴ�.
public class CRUD {
	// CRUD : ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "�����ȣ", "����̸�", "����", "�Ŵ���", "�Ի�����", "�޿�", "Ŀ�̼�", "�μ���ȣ", "����" };

	public static void main(String[] args) {
		seLectAll();
	}

	private static void seLectAll() {
		DAO dao = new DAO();
		ArrayList<Emp> e =dao.selectAll();
		
		if (e==null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0],menus[1],menus[2],menus[3],
			menus[4],menus[5],menus[6],menus[7]);
			for (Emp s:e) {
				System.out.println(s.toString());
			}
		}
	}
}
