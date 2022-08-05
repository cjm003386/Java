//사용자가 정의한 메서드를 실행할 수 있도록 합니다.
//이것을 메서드 호출이라고 합니다.
//즉 메서드를 호출하면 해당 메서드를 실행합니다.

package ex06_2_method;

public class MethodExample9 {
	
 //접근제어자  객체생성없이 접근가능  반환되는 값의 자료형       메서드이름 (매개변수 목록)
	public      static           void                main(String args[]) {
		int num=50;
		char data = '*';
		print(num, data);
	}

	//메서드 정의
	public static void print(int n, char parameter)//자료형만 일치o 변수명은 상관x 
	{
		for(int i=0; i<n; i++) {
			System.out.print(parameter);
			
		}
			
	}
}
