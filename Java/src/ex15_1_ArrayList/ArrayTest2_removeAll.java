package ex15_1_ArrayList;

import java.util.ArrayList;

public class ArrayTest2_removeAll {
	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("��");		list1.add("����");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("��");		
		list2.add("��");
		list2.add("����");
		list2.add("����");	
		list2.add("�ܿ�");	
		
		
		//list2 - list1 : ������
		list2.removeAll(list1); //list2���� list1�� ���� �����͸� ����
		
		System.out.println(list1); //[��, ����]
		System.out.println(list2); //[����, �ܿ�]
		
		}
	

}
