//값을 입력받는 Scanner 클래스를 사용해 봅시다.
//Scanner 클래스는 java.util 패키지에 있습니다.
//nextInt() : 키보드로 부터 정수형의 값을 입력 받는 메서드입니다.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		//System.in은 키보드로 데이터를 입력 받을때 사용합니다.
		InputStream is = System.in;
		
		//클래스명  참조형변수  연산자   생성자 호출
		Scanner     sc   =   new    Scanner(is);
		
		//콘솔에서 "정수를 입력 하세요>" 다음에 커서를 위치하고 숫자 입력 후 엔터
		int a, b, result;
		System.out.print("정수1를 입력 하세요>");
		a = sc.nextInt(); //정수를 읽어 변수 a에 저장합니다.
		
		System.out.print("정수2를 입력 하세요>");
		b = sc.nextInt();
		
		result = a + b;
		//%-5d : 5자리를 차지하고 왼쪽부터 숫자들이 출력되며 공백으로 처리
		//%5d : 5자리를 차지하고 오른쪽부터 숫자들이 출력되며 빈자리는 공백으로 처리
		
		System.out.printf("%-5d + %5d = %-5d\n", a, b, result );
		
		result = a - b;
		System.out.printf("%-5d - %5d = %-5d\n", a, b, result );
		
		result = a * b;
		System.out.printf("%-5d * %5d = %-5d\n", a, b, result );
		
		result = a / b;
		System.out.printf("%-5d / %5d = %-5d\n", a, b, result );
		
		
		sc.close();
		
		
		
	}

}
