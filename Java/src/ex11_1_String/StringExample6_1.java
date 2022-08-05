//문자열 추출 메소드
//1.substring(int beginIndex) : beginIndex부터 문자열 끝까지 부분 문자열 리턴
//2.substring(int beginIndex, int endIndex) :
//					beginIndex 부터 endIndex-1 까지 부분 문자열 리턴

//출력결과)
//추출한 숫자는 4이고 여자입니다.
package ex11_1_String;

public class StringExample6_1 {
	public static void main(String argsp[]) {
		String jumin = "123456-9123456";
		
		String s = jumin.substring(7,8);//substring(n1,n2); n1부터 n2-1까지 추출
		System.out.print("추출한 숫자는 " + s + "이고 ");		
		
		if(s.equals("1") || s.equals("3")) {
			System.out.println("남자입니다.");
		}else if (s.equals("2") || s.equals("4")) {
			System.out.println("여자입니다.");
		}else
			System.out.println("외국인입니다.");
		
		
//		switch (s) {
//		case "1":
//		case "3":
//			System.out.println("남자입니다.");
//			break;
//		case "2":
//		case "4":
//			System.out.println("여자입니다.");
//			break;
//		default:
//			System.out.println("외국인입니다.");
//			}
		
		

		
		//		String jumin = "123456-9123456";
//		
//		char ch = jumin.charAt(7);//substring(n1,n2); n1부터 n2-1까지 추출
//		System.out.print("추출한 숫자는 " + ch + "이고 ");	
//		
//		switch (ch) {
//		case '1':
//		case '3':
//			System.out.println("남자입니다.");
//			break;
//		case '2':
//		case '4':
//			System.out.println("여자입니다.");
//			break;
//		default:
//			System.out.println("외국인입니다.");
//			}
		
	
	}
	
}
