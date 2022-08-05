package ex22_4_1_select_statement_dao;

import java.util.*;

//emp�� ��� ������ ��ȸ�ϴ� Ŭ������ ���� ������ �����͸� ����մϴ�.
public class CRUD2_Map {
	// CRUD : ��ǻ�� ����Ʈ��� ������ �⺻���� ������ ó�� ���
	// C(Create-insert), R(Read-select)
	// U(Update-update), D(Delete-delete)
	static String menus[] = { "�����ȣ", "����̸�", "����", "�Ŵ���", "�Ի�����", "�޿�", "Ŀ�̼�", "�μ���ȣ", "����" };

	public static void main(String[] args) {
		seLectAll();
	}

	private static void seLectAll() {
		DAO2 dao2 = new DAO2();
		ArrayList<Map<String, Object>> m =dao2.selectAll();
		
		if (m==null) {
			System.out.println("�˻� ����� �����ϴ�.");
		}else {
			System.out.printf("%s\t%s\t%s\t\t%s\t%s\t\t%s\t%s\t%s\t\n", menus[0],menus[1],menus[2],menus[3],
			menus[4],menus[5],menus[6],menus[7]);
			for (Map<String, Object> s:m) {
				System.out.printf("%-8s%-8s%-16s%s\t%-16s%s\t%s\t%s\n",
						s.get("Empno"),s.get("Ename"),s.get("Job"),s.get("Mgr"),s.get("Hiredate")
						, s.get("Sal"),s.get("Comm"),s.get("Deptno"));
			}
		}
	}
}
