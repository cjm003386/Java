//���� �Է¹޴� Scanner Ŭ������ ����� ���ô�.
//Scanner Ŭ������ java.util ��Ű���� �ֽ��ϴ�.
//nextInt() : Ű����� ���� �������� ���� �Է� �޴� �޼����Դϴ�.
package ex04_06_arithmetic_op;

import java.io.InputStream;
import java.util.Scanner;

public class Oper02_input {
	public static void main(String[] args) {
		//System.in�� Ű����� �����͸� �Է� ������ ����մϴ�.
		InputStream is = System.in;
		
		//Ŭ������  ����������  ������   ������ ȣ��
		Scanner     sc   =   new    Scanner(is);
		
		//�ֿܼ��� "������ �Է� �ϼ���>" ������ Ŀ���� ��ġ�ϰ� ���� �Է� �� ����
		int a, b, result;
		System.out.print("����1�� �Է� �ϼ���>");
		a = sc.nextInt(); //������ �о� ���� a�� �����մϴ�.
		
		System.out.print("����2�� �Է� �ϼ���>");
		b = sc.nextInt();
		
		result = a + b;
		//%-5d : 5�ڸ��� �����ϰ� ���ʺ��� ���ڵ��� ��µǸ� �������� ó��
		//%5d : 5�ڸ��� �����ϰ� �����ʺ��� ���ڵ��� ��µǸ� ���ڸ��� �������� ó��
		
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
