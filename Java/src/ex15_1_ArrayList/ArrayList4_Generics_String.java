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

public class ArrayList4_Generics_String {
	public static void main(String[] args) {
		//ArrayList ��ü ����
		List<String> list = new ArrayList<String>();
		
		//list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		
		int num = list.size(); //list�� �ִ� �������� ���� ���ϴ� �޼ҵ�
		
		//List�� �ִ� �������� ����ŭ �ݺ��ϸ鼭 �����͸� ������ ���
		for (int cnt = 0; cnt < num; cnt++) {
			//get(index)�޼ҵ带 ����Ͽ� index��ġ�� �ִ� �ڷḦ �����ɴϴ�.
			String str = list.get(cnt);
			System.out.println(str);
		}
		
		System.out.println("====== ���� for �� =======");
		for (String str : list) {
			System.out.println(str);
		}
	}
}