package ex11_1_String;

public class StringExample1 {
	public static void main(String args[]) {
		String str = "���õ� ȭ���� �Դϴ�.";
		int len = str.length(); //length �޼��� ȣ��
		
		for(int cnt = 0; cnt < len; cnt++) {
			char ch = str.charAt(cnt);	//charAt �޼��� ȣ��
			System.out.println("index = " + cnt + " ���� = " + ch);
		}
	}

}
