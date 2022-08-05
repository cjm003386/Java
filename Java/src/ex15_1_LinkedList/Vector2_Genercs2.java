/*
 Generic ���
 
 Vector Ŭ���� - ArrayList�� ������
 				ArrayList�� ���� ���, �� �߿��� ArrayList�� �� ���� ���
 1.�������� �ڷ����� Data�� ��� ������ �� �ֽ��ϴ�.
 ex) int, double, char, boolean, String ets
 2.�����ִ� ��,��� ó��(index��ȣ ������ �����)
 3. �ߺ��� Data�� ���� �� �� �ֽ��ϴ�.
 4. ����� ��� �پ�(���������� ��� ����)
 5. ������ ����ȭ�� �ϱ� ������ ���� ������ ó��������
 	ArrayList�� LinkedList���� ������ �������ϴ�.
 	����)����ȭ�� �����忡�� �����ڿ��� �۾��� ��ġ�� �� ������
 		�ٸ� �����忡�� �����ڿ��� ���� ���� ���ϰ� ����ϴ� ��
 */

package ex15_1_LinkedList;

import java.util.*;

public class Vector2_Genercs2 {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>(); //String���� �� �� �־��
		vec.add("Apple");
		vec.add("banana");
		vec.add("oRANGE");
		print(vec);
		
		vec.add(2, "Ű��");
		print(vec);
		
		vec.set(0,  "������");
		print(vec);
		
		vec.remove(1);
		print(vec);
		
		vec.remove("Ű��");
		print(vec);
	}

	private static void print(Vector<String> vec) {
		System.out.println("========================");
		
		for(int i=0; i<vec.size(); i++) {
			String temp = vec.get(i);
			System.out.println(temp);
		}
		
	}

}
