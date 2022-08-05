//지역 변수 obj에 초기화 하지 않아 컴파일 에러 발생

package ex09_02_null;

public class RefTypeExample3 {
	public static void main(String args[]) {
		Point obj;
		
		//주석 해제 시 에러 System.out.println(obj.x);
		//주석 해제 시 에러 System.out.println(obj.y);
	}

}

