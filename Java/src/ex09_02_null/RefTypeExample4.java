//지역 변수 obj에 초기화 하지 않아 컴파일 에러 발생
//실행시 에러 발생(런타임 에러 발생)
package ex09_02_null;

public class RefTypeExample4 {
	public static void main(String args[]) {
		Point obj = null;
		
		System.out.println(obj.x);
		
		System.out.println(obj.y);
	}

}
