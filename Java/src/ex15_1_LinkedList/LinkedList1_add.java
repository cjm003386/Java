/*LinkedList ��� ��
 * LinkdeList�� ArrayList�� ������
 * - �������� �߰� �Ǵ� ������ ArrayList���� �ӵ��� �����ϴ�.
 * 	ArrayList�� ��� ���ʴ�� �����͸� �߰��ϰ� �������������� �����͸� �����ϴ� ���� LinkedList���� �����ϴ�.
 * 	������ �߰��� �����͸� �߰��Ϸ��� ���ڸ��� ����� ���� �ٸ� �����͸� �����ؼ� �̵��ؾ� �ϰ�
 * 	������ ��쿡�� �����͸� ���ġ�ؾ� ������
 * 	LinkdeList�� ��쿡�� �� ��Ұ� ���Ḹ �������ָ� �Ǳ� ������ ó���ӵ��� ����� �����ϴ�.
 * 	- �˻��� ArrayList�� ���������� �޸𸮻� �����ϱ� ������ ã�µ� ��������
 * 	�ҿ��������� ��ġ�� LinkedList�� ó������ ���ʴ�� ���󰡾� ���ϴ� ���� ���� �� �־� �˻��ð��� �����ϴ�.
 *
 * */

package ex15_1_LinkedList;

import java.util.*;

public class LinkedList1_add {
	public static void main (String args[]) {
		//LinkedList ��ü�� ����
		LinkedList<String> list = new LinkedList<String>();
		list.add("����");
		list.add("����");
		list.add("������");
		int num = list.size();
		for (int cnt = 0; cnt < num; cnt++) {
			String str = list.get(cnt);
			System.out.println(str);
		}

	
	}

}
