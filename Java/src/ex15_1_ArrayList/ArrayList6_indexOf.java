/* 
 * ArrayList�� �ִ� ������ �˻��ϴ� ��
 * -indexOf(data): ���ڿ� ���� ���� ���� ù ��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * -lastIndexOf(data) : ���ڿ� ���� ���� ���������� ������� �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
 * -���ڿ� ���� ���� ������ -1�� ����
 */

package ex15_1_ArrayList;

import java.util.*;

public class ArrayList6_indexOf {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("���");
		int index1 = list.indexOf("���");
		int index2 = list.lastIndexOf("���");
		System.out.println("ù��° ���:" + index1);
		System.out.println("������ ���:" + index2);
	}

}
