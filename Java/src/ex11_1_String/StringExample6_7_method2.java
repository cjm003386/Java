package ex11_1_String;

public class StringExample6_7_method2 {
	public static void main(String args[]) {
		String zumin = "123456-1234569";
		
		if(check_length(zumin)) {
			if(check_hyphen(zumin)) {
				int isNumber = isNumber(zumin);
				if(isNumber >= 0 && isNumber <=5) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if (isNumber >=7 && isNumber <=13 ) {
					System.out.println("�ֹι�ȣ ���ڸ��� ���ڷ� �Է��ϼ���");
				}else if(isNumber==-1) {
					System.out.println(pandan_gender(zumin) + "�Դϴ�.");
				}
				
				
			}else {
				System.out.println("-�� �־��ּ���");
			}
			
		}else {
			System.out.println("�ֹε�Ϲ�ȣ�� 14�ڸ� �Դϴ�.");
		}
	}// main end
	
	static String pandan_gender(String zumin) {
		String gender = zumin.substring(7,8);
		String result = "�ܱ���";
		switch (gender) {
		case"1":
		case"3":
			result = "����";
			break;
		
		case "2":
		case "4":
			result ="����";
		}
		return result;
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
