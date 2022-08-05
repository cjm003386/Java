package ex11_1_String;

public class StringExample6_7_method {

	static boolean check_length(String zumin){
		return zumin.length() !=14 ? false : true;
		}
	
	static String pandan_gender(String zumin) {
		String gender = zumin.substring(7,8);
		String result = "외국인";
		switch (gender) {
		case"1":
		case"3":
			result = "남자";
			break;
		
		case "2":
		case "4":
			result ="여자";
		}
		return result;
	}
	
	public static void main(String args[]) {
		String zumin = "123456-1789012";
		
		if(check_length(zumin)) {
			System.out.println(pandan_gender(zumin) + "입니다.");
		}else {
			System.out.println("주민등록번호는 14자리 입니다.");
		}
	} //main end
}
