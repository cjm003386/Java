package ex11_1_String;

public class StringExample7 {
	public static void main(String args[]) {
		
	
	String str1 = " I Like Java";
	String str2 = str1.trim();
	System.out.println("===trim() : ���ڿ� �յ� �������� ===");
	System.out.println(str1);
	System.out.println(str2);
	System.out.println("���ڿ� ���� = " + str2.length() + "\n");
	
	System.out.println("=== concat() : ���ڿ� ���� ===");
	System.out.println(str2.concat(" ������ ���ƿ�"));
	System.out.println(str2 + "\n");
	
	System.out.println("=== toUpperCase() : �빮�ڷ� ��ȯ ===");
	System.out.println(str2.toUpperCase());
	System.out.println(str2 + "\n");
	
	System.out.println("=== toLowerCase() : �ҹ��ڷ� ��ȯ ==");
	System.out.println(str2.toLowerCase());
	System.out.println(str2 + "\n");
	
	System.out.println("=== replace() : ���ο� ���ڷ� ��� ���� ===");
	System.out.println(str2.replace('J', 'j'));
	System.out.println(str2 + "\n");
	
	System.out.println("========toString()==========");
	System.out.println(str1.toString());
	System.out.println(str2.toString() + "\n");
	

	}
}