//사용자가 정의한 메서드를 실행할 수 있도록 합니다.
//이것을 메서드 호출이라고 합니다.
//즉 메서드를 호출하면 해당 메서드를 실행합니다.

package ex06_2_method;

public class MethodExample91 {
	
 //접근제어자  객체생성없이 접근가능  반환되는 값의 자료형       메서드이름 (매개변수 목록)
	public      static           void                main(String args[]) {
		
		int[] num = {1, 2, 3, 4, 5};
		print(num);//두 개의 값을 넘기고 싶으면 콤마를 사용하면 됩니다.
		return;//여기서 main()메서드를 종료합니다.
	}

	//메서드 정의
	public static void print(int[] num)//자료형만 일치o 변수명은 상관x 
	{
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		//or 향상된 for문
		//for(int a : num) {
			//System.out.print(a + " ");
			
		return;//반환되는 값의 자료형이 void인 경우 이 문장은 생략 가능합니다.
	}
}
