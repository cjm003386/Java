package ex05_3_while;

public class while01_예제_합구하기2 {
	public static void main(String agrs[]) {

		System.out.println("===홀수출력===");
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;

		}

		System.out.println("===짝수출력===");
		i = 2;
		while (i <= 10) {
			System.out.println(i);
			i = i + 2;
		}

		System.out.println("===1~10까지의 합===");
		int sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 1;
		}
		System.out.println(sum);

		System.out.println("==홀수 합 구하기==");

		sum = 0;
		i = 1;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}

		System.out.println("1~10까지의 홀수의 합 = " + sum);

		System.out.println("==짝수 합 구하기==");

		sum = 0;
		i = 2;
		while (i <= 10) {
			sum = sum + i;
			i = i + 2;
		}
		System.out.println("1~10까지의 짝수의 합 = " + sum);
	}

}
