//���ڿ��� �Էµ� ���� ���� ó���ϱ� ���� ���?
package ex14_1_Wrapper;

public class Wrapper3_1_int_to_String {
	public static void main(String args[]) {
		
		int i = 10;
		//���1. Integer.toString()���
		String age = Integer.toString(i);
		
		//���2. + ������ ���
		String age2 = "" + i;
		
		System.out.println(age);
		System.out.println(age2);
	}
}
