package ex06_3_method_intro4_return_test;

public class MethodExample4 {
	/*
	 * �������� (variable arguments)
	 *       : �Ű� ������ ������ �������� �ƴ� �������� ������ �� �� �ֽ��ϴ�.
	 *       ����) Ÿ��...������
	 *       ��Ģ) �������� �̿� �� �ٸ� �Ű� ������ �ִ� ��� �������ڸ� �Ű����� �߿���
	 *       ���� �������� �����ؾ� �մϴ�.
	 *       
	 * */
 public static String concatenate(String delim, String...str) {
	 String result = "";
	 
	 for(String imsi : str)
		 result+= imsi + delim; //��) ���, ��.
	 return result;
 }
 
 public static void main(String[] args) {
	 System.out.println(concatenate(",","���", "��"));
	 System.out.println(concatenate(",","���", "��", "���"));
	 System.out.println(concatenate(",","���", "��", "���", "Ű��"));
	 System.out.println(concatenate(",", new String[]{"���", "��", "���", "Ű��"}));
 }
}

