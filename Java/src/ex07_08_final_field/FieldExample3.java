//�������� �Է��ϼ���>3.5
//���� ������ =3.5
//���� ���� =38.465

package ex07_08_final_field;

import java.io.InputStream;
import java.util.Scanner;

public class FieldExample3 {
	public static void main(String args[]) {
		//InputStream in = System.in;
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���>");
		
		//double input = sc.nextDouble();
		Circle obj = new Circle(sc.nextDouble());
		print(obj);
		sc.close();
		
	}

	private static void print(Circle circle) {
		System.out.println("���� ������ = " + circle.radius);
		System.out.println("���� ���� = " + circle.getArea());
		
		
	}
	

}
