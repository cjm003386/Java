package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest1_contains {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("��");		list1.add("����");
		
		if (list1.contains("��")) {
			System.out.println("���� �����մϴ�.");
		}else {
			System.out.println("���� �������� �ʽ��ϴ�.");
		}
	}

}
