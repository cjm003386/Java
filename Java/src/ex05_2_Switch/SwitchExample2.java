package ex05_2_Switch;

public class SwitchExample2 {
	public static void main(String args[]) {
		String ch = "a";
	    //char ch = 'a';
	// String ch = "+";
		
		switch (ch) {
		case "A"://"+"
		case "a":
			System.out.println("사과");//"+"
			break;

		case "P"://"-"
		case "p":
			System.out.println("배");//"-"
			break;

		case "G"://"*"
		case "g":
			System.out.println("포도");//"*"
			break;

		default:
			System.out.println("?");
			//("+, -, *, / 중 한개를 입력하세요");
		}
		System.out.println("끝.");
		
	}

}
