//ArrayList�� �����͸� ����/����/�����ϴ� ��
package ex15_1_ArrayList;
import java.util.*;
public class ArrayList5_add_set_remove {
	public static void main(String args[]) {
		//ArrayList ��ü ����
		List<String> list = new ArrayList<String>();
		
		//list�� 3���� �����͸� �߰�
		list.add("����");
		list.add("����");
		list.add("������");
		pArrayList(list);
		
		//list�� 2���� �����͸� ����
		list.add(2, "Ű��"); //�ε��� 2 ��ġ�� ����
		list.add(4, "Ű��"); //�ε��� 4 ��ġ�� ����
		pArrayList(list);
		
		//�ε��� 0 ��ġ�� �����͸� "������"�� �ٲߴϴ�.
		list.set(0,  "������");
		pArrayList(list);
		
		//�ε��� 1 ��ġ�� �ִ� �����͸� �����մϴ�.
		list.remove(1);
		pArrayList(list);
		
		// list���� "Ű��"��� �����͸� ã�Ƽ� �����մϴ�.
		list.remove("Ű��");
		pArrayList(list);
		
	}

	private static void pArrayList(List<String> list) {
		System.out.println("===================");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println("index=" + cnt + "\t" + "������=" + str);
			
		}
		
	}

}
