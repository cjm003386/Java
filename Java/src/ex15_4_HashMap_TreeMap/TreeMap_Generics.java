//TreeMap
//Ű�� ���� ������ �̷���� �����͸� Ű�� �����ؼ� �����մϴ�.
// �˻��� ���Ŀ� ������ �÷��� Ŭ�����Դϴ�.
package ex15_4_HashMap_TreeMap;

import java.util.*;

public class TreeMap_Generics {
	public static void main(String args[]) {
		//HashMap ��ü ���� ��� �� ����
		//Map hm = new HashMap(); 	//��� 1. ��ĳ����
		TreeMap<String, String> tm = new TreeMap<String, String>(); //���2. ���� Ŭ������ ���� ��ü ����
		
		//Key�� value ���� ����
		//Map�� put()�� �̿��� (Key, Value) ������ �ڷ� �����մϴ�.
		tm.put("woman", "����ִ�");
		tm.put("man", "�����Ϸ�");
		tm.put("age", new String("10"));
		tm.put("city", "Seoul");
		tm.put("city",("Busan"));
		
		
		System.out.println(tm);
		//{woman=����ִ�, city=Busan, man=�����Ϸ�, age=10}
		
		//��¹�� 2. Key ���� ���
		System.out.println( tm.keySet()); // [woman, city, man, age]
		
		//��¹�� 3. value ���� ���
		System.out.println(tm.values());
		
		//��¹�� 4.
		//get(Key) : Key�� �ش��ϴ� Value�� ��� - ���� ���� ���
		System.out.println( tm.get("women")); //����ִ�
		System.out.println( tm.get("city")); //Busan
		
		//��¹�� 5.
		System.out.println("=====================");
		Set<String> keys = tm.keySet();
		for(String key : keys) {
			System.out.println(key + "=" + tm.get(key));
		}
	}

}
