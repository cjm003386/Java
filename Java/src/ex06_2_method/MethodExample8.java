//사용자가 정의한 메서드를 실행할 수 있도록 합니다.
//이것을 메서드 호출이라고 합니다.
//즉 메서드를 호출하면 해당 메서드를 실행합니다.

package ex06_2_method;

public class MethodExample8 {
	
 //접근제어자  객체생성없이 접근가능  반환되는 값의 자료형       메서드이름 (매개변수 목록)
	public      static           void                main(String args[]) {
		int num=50;
		char data = '*';
		print(num, data);
	}

	//메서드 정의
	public static void print(int p_num, char p_parameter) {
		System.out.println("print() 메서드 입니다.");
		System.out.println("main() 메서드에서 전달받은 데이터 값은" + p_num +","+ p_parameter + "입니다.");
		
		
		
		
	}
}
