package ex03_4_casting;

public class Casting1_int_float2 {
	public static void main(String args[]) {

		double d2 = 10.12345;

		// 2. ����� ����ȯ
		// ���� �߻� - Type mismatch : caanot convert from double to int
		// int i2 = d2 �� ���� ������ ������ �Ǽ��� ���� ������ �� �����ϴ�.
		int i2 = (int) d2;

		System.out.println("i2 �����ʹ� " + i2 + "�Դϴ�.");

		//����Ȯ��
		float ft = (float)3.14;
		System.out.println(ft);

	}

}
