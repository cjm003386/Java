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
		
		
		
		

		
			//����
			InputStream in = System.in;
			Scanner sc = new Scanner(in);
			
			System.out.println("���� �Է��ϼ���>");
			int num = sc.nextInt();
			
			if(!(num<=10 && num>=1)){
				System.out.println("(!)1~10 ������ ���� �ƴմϴ�.");
			}
			if(num>10 || num<1){
				System.out.println("1~10 ������ ���� �ƴմϴ�.");
				}
			// �ΰ� �� ���� ���̴�.
			
		sc.close();	
	}

}
