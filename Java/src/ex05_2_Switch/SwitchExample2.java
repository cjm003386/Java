package ex05_2_Switch;

public class SwitchExample2 {
	public static void main(String args[]) {
		String ch = "a";
	    //char ch = 'a';
	// String ch = "+";
		
		switch (ch) {
		case "A"://"+"
		case "a":
			System.out.println("���");//"+"
			break;

		case "P"://"-"
		case "p":
			System.out.println("��");//"-"
			break;

		case "G"://"*"
		case "g":
			System.out.println("����");//"*"
			break;

		default:
			System.out.println("?");
			//("+, -, *, / �� �Ѱ��� �Է��ϼ���");
		}
		System.out.println("��.");
		
	}

}
