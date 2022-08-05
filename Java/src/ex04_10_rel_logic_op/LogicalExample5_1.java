package ex04_10_rel_logic_op;

import java.io.InputStream;
import java.util.Scanner;

public class LogicalExample5_1 {
	public static void main(String args[]) {
		
		System.out.println(!true);
		System.out.println(!false);
		
		int a =3, b=4;
		
		if(a >= b) {
			System.out.println(a + ">=" + b);
		}
		
		if(!(a >= b)) {
			System.out.println(a + "<" + b);
			}
		
		
		
		

		
			//예제
			InputStream in = System.in;
			Scanner sc = new Scanner(in);
			
			System.out.println("수를 입력하세요>");
			int num = sc.nextInt();
			
			if(!(num<=10 && num>=1)){
				System.out.println("(!)1~10 사이의 수가 아닙니다.");
			}
			if(num>10 || num<1){
				System.out.println("1~10 사이의 수가 아닙니다.");
				}
			// 두개 다 같은 뜻이다.
			
		sc.close();	
	}

}
