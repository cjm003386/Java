//unchecked exception에 해당 - 컴파일 에러 없음
//실행시 에러 발생 - 예외 발생
package ex07_2_Exception;

public class ExceptionExample2_4 {
	public static void main(String args[]) {
		int num1 = 3, num2 = 0;
		try {
			int result = num1 / num2;
			System.out.println(result);
		} catch (ArithmeticException e) {
			String message = e.getMessage();
			System.out.print(message);
		} finally {
			System.out.println("여기까지 왔어요~");
		}
	}

}
