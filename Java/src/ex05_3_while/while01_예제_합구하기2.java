package ex05_3_while;

public class while01_����_�ձ��ϱ�2 {
	public static void main(String agrs[]) {

		System.out.println("===Ȧ�����===");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;

		}

		System.out.println("===¦�����===");
		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}

		System.out.println("===1~10������ ��===");
		int sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);

		System.out.println("==Ȧ�� �� ���ϱ�==");

		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}

		System.out.println("1~10������ Ȧ���� �� = " + sum);

		System.out.println("==¦�� �� ���ϱ�==");

		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10������ ¦���� �� = " + sum);
	}

}
