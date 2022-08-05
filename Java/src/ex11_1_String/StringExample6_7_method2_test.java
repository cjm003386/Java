package ex11_1_String;

public class StringExample6_7_method2_test {
	public static void main(String args[]) {
		String zumin = "123456-12345690";
		
		System.out.println(zumin.length() == 14);
		System.out.println(zumin.length() == 14 ? true : false);
	}
	
	static boolean check_length(String zumin) {
		return zumin.length() ==14;
	}
	
	static boolean check_hyphen(String zumin) {
		return zumin.substring(6,7).equals("-");
	}
	
	static int isNumber(String zumin) {
		int index = -1;
		int len = zumin.length();
		for (int i = 0; i<len; i++ ) {
			
			if(i == 6)
				continue;
			
			char test = zumin.charAt(i);
			//if (!zumin.charAt(i) >= '0' && zumin.charAt(i) <= '9[')) {
			if(test < '0' || test > '9') {
				index = i;
				break;
			}
		}
		return index;
	}
	

}
