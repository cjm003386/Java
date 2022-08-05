/*
 * 1.���׸���(Generics) jdk 1.5���� ó�� ����
 * 	�پ��� Ÿ���� ��ü���� �ٷ�� �޼ҵ峪 �÷��� Ŭ������ ������ ���� Ÿ�� üũ��
 * 	���ִ� ����Դϴ�.
 * 2. Ŭ���� ���� ����(<>)��ȣ�� �̿��ؼ� ����ϴ�.
 * 1) <>�ȿ� Ư�� �ڷ���(Wrapper Ŭ����, String, ����� ���� Ŭ������-������)�� �־��ָ� �˴ϴ�.
 * 2) API ���� ǥ��
 * 	Class ArrayList<E> : E�� ArrayList��� �н��ϴ�.
 * 	- ArrayList : ���� Ÿ��(raw type)
 * 	- E(Ÿ�� �Ű� ����) : ��ȣ�� ������ �ٸ� �� ������ ������ Ÿ���� �ǹ��մϴ�.
 * 
 * 		���� : �ǹ�
 * 		E : ����(Element)
 * 		K : Ű(KEy)
 * 		T : Ÿ��(Type)
 * 		V : ��(Value)
 * 
 * -��� ��)
 * 	List<String>		list = new ArrayList<String>();
 * 	ArrayList<String> 	list = new ArrayList<String>();
 * 	ArrayList<Integer> 	list = new ArrayList<Integer>();
 * 	ArrayList<double> 	list = new ArrayList<double>();
 * 	ArrayList<MemberInput> 	list = new ArrayList<MemberInput>();
 * */
package ex15_1_ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList3_Generics {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//ArrayList list = new ArrayList();
		
		//�ڷ� �߰�
		list.add("�ϳ�");
		list.add(2);//list.add(Integer.valueOf(2));
		list.add(false);
		list.add(3.42);
		list.add("��");
		list.add("five");
		list.add('A');
		
		//��� ��� 1. - �ش� ��ü������ ����ϴ� ���
		System.out.println("====��ü������ ����ϱ�====");
		System.out.println(list);
		
	}

}


