package ex06_3_method_intro3_return;

public class MethodExample2 {
	//접근제어자  객체생성없이 접근가능  반환되는 값의 자료형       메서드이름 (매개변수 목록)
		public      static           void                main(String args[]) {
			hap(1,10); //아무것도 출력되지 않습니다.
		
			//1. return sum의 값을 저장해서 출력하는 방법
			int result = hap(1,100);
			System.out.println("1: result =" + result);
   }
		               //반환형
	public static   int     hap(int start, int end) {
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum += i;
				
		}
		return sum;//sum의 자료형과 메서드의 반환형이 일치해야 합니다.
	}
}