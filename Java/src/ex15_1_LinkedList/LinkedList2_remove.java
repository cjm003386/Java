package ex15_1_LinkedList;

import java.util.*;

public class LinkedList2_remove {
	public static void main(String args[]) {
	// LinkedList ��ü�� ����
	LinkedList<String> list = new LinkedList<String>();
	list.add("����");
	list.add("����");
	list.add("������");
	list.add(2, "Ű��");
	pLinkedList(list);
	
	list.set(0,  "������");
	pLinkedList(list);
	
	list.remove(1);
	pLinkedList(list);
	
	list.remove("Ű��");
	pLinkedList(list);
	
	}
	
	static void pLinkedList(LinkedList<String> list) {
		System.out.println("================");
		// iterator()�޼ҵ带 ȣ���Ͽ� Iterator ��ü�� ����ϴ�.
		Iterator<String> iterator = list.iterator();
		
		//Iterator ��ü�� �̿��Ͽ� list�� �ִ� �����͸� ������� �����ͼ� ���
		while (iterator.hasNext()) {//���� ��ġ���� ���� �����Ͱ� �ִ��� Ȯ���ϴ� �޼ҵ�
			String str = iterator.next();//���� �����͸� �������� �޼ҵ�
			System.out.println(str);
		}
	}

}

