//���ڿ� ���� �޼ҵ�
//1.substring(int beginIndex) : beginIndex���� ���ڿ� ������ �κ� ���ڿ� ����
//2.substring(int beginIndex, int endIndex) :
//					beginIndex ���� endIndex-1 ���� �κ� ���ڿ� ����
package ex11_1_String;

public class StringExample6_0 {
	public static void main(String args[]) {
		String str = "���� ����ϴ� �ڹ�";
		
		for (int cnt = 0; cnt < str.length(); cnt++) {
			char ch = str.charAt(cnt); 	//charAt �޼��� ȣ��
			System.out.println("index = " + cnt + " ���� = " + ch);
		}
		
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, 6));
		
	}
}
